plugins {
    kotlin("jvm") version "1.8.0"
//    application
}

group = "dev.skkzsh"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

//application {
//    mainClass.set("MainKt")
//}
