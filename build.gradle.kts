plugins {
    kotlin("multiplatform") version "1.3.70"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

val ktorVersion = "1.3.2"

kotlin {
    iosX64("ios")
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation("io.ktor:ktor-client-core:$ktorVersion")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val iosMain by getting {
            dependencies {
                implementation("io.ktor:ktor-client-core-native:$ktorVersion")
                implementation("io.ktor:ktor-client-ios:$ktorVersion")
            }
        }
    }
}
