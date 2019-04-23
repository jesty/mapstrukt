import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.gradle.jvm.tasks.Jar


plugins {
    `build-scan`
    `maven-publish`
    kotlin("jvm") version "1.2.71"
    kotlin("kapt") version "1.2.71"
}

group = "com.github.jesty"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
    compile("org.mapstruct:mapstruct:1.3.0.Final")
    compile("com.squareup:kotlinpoet:0.7.0")
    compile("com.google.auto.service:auto-service:1.0-rc2")

    kapt("org.mapstruct:mapstruct-processor:1.3.0.Final")

    testCompile("org.mockito:mockito-core:2.+")
    testCompile("com.google.testing.compile:compile-testing:0.15")
    testCompile("org.junit.jupiter:junit-jupiter-api:5.3.1")
    testCompile("org.junit.jupiter:junit-jupiter-engine:5.3.1")
    testCompile("org.assertj:assertj-core:3.11.1")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform { }
}

publishing {
    publications {
        create<MavenPublication>("default") {
            from(components["java"])
        }
    }
    repositories {
        maven {
            url = uri("$buildDir/repository")
        }
    }
}


