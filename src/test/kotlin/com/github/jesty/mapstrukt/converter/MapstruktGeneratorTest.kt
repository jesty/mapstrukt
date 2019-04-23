package com.github.jesty.mapstrukt.converter

import com.github.jesty.mapstrukt.MapstruktGenerator
import com.google.testing.compile.Compiler.javac
import com.google.testing.compile.JavaFileObjects
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import org.junit.jupiter.api.Test
import java.io.File


class MapstruktGeneratorTest {

    @Test
    fun testGenerator() {
        javac()
                .withProcessors(MapstruktGenerator())
                .compile(JavaFileObjects.forResource("PersonConverter.java"))
        val expectedFile = File("src/test/resources/Mapstrukt.expected")
        val generatedFile = File("com/github/jesty/Mapstrukt.kt")
        assertTrue("Generated file doesn't exists", generatedFile.exists())
        assertEquals("File isn't as expected", generatedFile.readText(), expectedFile.readText())
        generatedFile.deleteRecursively()
    }

}
