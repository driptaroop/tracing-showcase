import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins{
    id("org.springframework.boot") version "2.5.4" apply false
    id("io.spring.dependency-management") version "1.0.11.RELEASE" apply false
    kotlin("jvm") version "1.5.21" apply false
    kotlin("plugin.spring") version "1.5.21" apply false
    kotlin("plugin.jpa") version "1.5.21" apply false
}

allprojects {
    repositories {
        mavenCentral()
    }

    group = "org.dripto"
    version = "0.0.1-SNAPSHOT"
}

subprojects {
    apply {
        plugin("org.springframework.boot")
        plugin("io.spring.dependency-management")
        plugin("org.jetbrains.kotlin.jvm")
        plugin("org.jetbrains.kotlin.plugin.spring")
    }

    configure<JavaPluginExtension> {
        sourceCompatibility = JavaVersion.VERSION_11
    }

    val implementation by configurations
    val testImplementation by configurations
    val runtimeOnly by configurations

    dependencies {
        implementation("org.springframework.boot:spring-boot-starter-web")
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        testImplementation("org.springframework.boot:spring-boot-starter-test")
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
            languageVersion = "1.5"
        }
    }

    if(name.endsWith("name-service")) {
        apply {
            plugin("org.jetbrains.kotlin.plugin.jpa")
        }

        dependencies {
            implementation("org.springframework.boot:spring-boot-starter-data-jpa")
            runtimeOnly("com.h2database:h2")
        }
    }
}