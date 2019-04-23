package com.github.jesty.mapstrukt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016\u00a8\u0006\u0012"}, d2 = {"Lcom/github/jesty/mapstrukt/MapstruktGenerator;", "Ljavax/annotation/processing/AbstractProcessor;", "()V", "buildStatement", "", "methodElement", "converterClass", "getSupportedAnnotationTypes", "", "getSupportedSourceVersion", "Ljavax/lang/model/SourceVersion;", "process", "", "set", "Ljavax/lang/model/element/TypeElement;", "roundEnv", "Ljavax/annotation/processing/RoundEnvironment;", "Companion", "mapstrukt"})
@com.google.auto.service.AutoService(value = javax.annotation.processing.Processor.class)
public final class MapstruktGenerator extends javax.annotation.processing.AbstractProcessor {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KAPT_KOTLIN_GENERATED_OPTION_NAME = "kapt.kotlin.generated";
    public static final com.github.jesty.mapstrukt.MapstruktGenerator.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<java.lang.String> getSupportedAnnotationTypes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public javax.lang.model.SourceVersion getSupportedSourceVersion() {
        return null;
    }
    
    @java.lang.Override()
    public boolean process(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends javax.lang.model.element.TypeElement> set, @org.jetbrains.annotations.NotNull()
    javax.annotation.processing.RoundEnvironment roundEnv) {
        return false;
    }
    
    private final java.lang.String buildStatement(java.lang.String methodElement, java.lang.String converterClass) {
        return null;
    }
    
    public MapstruktGenerator() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/github/jesty/mapstrukt/MapstruktGenerator$Companion;", "", "()V", "KAPT_KOTLIN_GENERATED_OPTION_NAME", "", "mapstrukt"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}