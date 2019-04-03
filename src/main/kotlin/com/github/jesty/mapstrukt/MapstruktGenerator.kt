package com.github.jesty.mapstrukt

import com.google.auto.service.AutoService
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asTypeName
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.Mapping
import java.io.File
import javax.annotation.processing.AbstractProcessor
import javax.annotation.processing.Processor
import javax.annotation.processing.RoundEnvironment
import javax.lang.model.SourceVersion
import javax.lang.model.element.ElementKind
import javax.lang.model.element.ExecutableElement
import javax.lang.model.element.TypeElement

@AutoService(Processor::class)
class MapstruktGenerator : AbstractProcessor() {

    override fun getSupportedAnnotationTypes(): MutableSet<String> {
        return mutableSetOf(Mapping::class.java.name, InheritInverseConfiguration::class.java.name)
    }

    override fun getSupportedSourceVersion(): SourceVersion {
        return SourceVersion.latest()
    }

    override fun process(set: MutableSet<out TypeElement>, roundEnv: RoundEnvironment): Boolean {
        val pack = "com.github.jesty"
        val fileName = "Mapstrukt"
        val classBuilder = TypeSpec.classBuilder(fileName)
        if (set.size == 0) return false

        val mappingMethods = roundEnv
                .getElementsAnnotatedWith(Mapping::class.java)
        val inverseMethods = roundEnv
                .getElementsAnnotatedWith(InheritInverseConfiguration::class.java)

        println("Mapping methods #" + mappingMethods.size)
        println("Inherit Inverse Configuration methods #" + inverseMethods.size)

        val functions = mappingMethods
                .union(inverseMethods)
                .filter { it.kind == ElementKind.METHOD }
                .map {
                    val methodElement = it as ExecutableElement
                    val parameters = methodElement.parameters
                    val funName = "${parameters[0].asType()}.${it.simpleName}"
                    val methodName = it.simpleName.toString()
                    val converterClass = methodElement.enclosingElement.toString()
                    println("Creating extension function $funName for $methodElement in $converterClass")
                    return@map FunSpec
                            .builder(funName)
                            .returns(methodElement.returnType.asTypeName())
                            .addStatement(buildStatement(methodName, converterClass))
                            .build()

                }

        functions.forEach {
            classBuilder
                    .addFunction(it)
                    .build()
        }

        val file = FileSpec.builder(pack, fileName)
                .addType(classBuilder.build())
                .build()
        val kaptKotlinGeneratedDir = processingEnv.options[KAPT_KOTLIN_GENERATED_OPTION_NAME]
        file.writeTo(File(kaptKotlinGeneratedDir, "$fileName.kt"))
        return true
    }

    private fun buildStatement(methodElement: String, converterClass: String): String {
        return "return org.mapstruct.factory.Mappers.getMapper($converterClass::class.java).$methodElement(this)"
    }

    companion object {
        const val KAPT_KOTLIN_GENERATED_OPTION_NAME = "kapt.kotlin.generated"
    }
}