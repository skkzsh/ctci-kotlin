plugins {
    kotlin("jvm") version "1.8.22"
//    application
}

group = "dev.skkzsh"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://maven.pkg.github.com/skkzsh/dsa-kotlin")
        credentials {
            username = project.findProperty("gpr.user") as String? ?: System.getenv("GITHUB_ACTOR")
            password = project.findProperty("gpr.key") as String? ?: System.getenv("GPR_TOKEN")
        }
    }
}

dependencies {
    implementation("dev.skkzsh:dsa:1.0-SNAPSHOT")
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.3")
}

// 毎回最新を取得 (キャッシュを使わない)
configurations.all {
    resolutionStrategy.cacheChangingModulesFor(0, "hours")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

//application {
//    mainClass.set("MainKt")
//}
