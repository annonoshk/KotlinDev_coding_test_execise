plugins {
    kotlin("jvm") version "2.0.21"
}

group = "org.crevolika"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.11.4")
    testImplementation(kotlin("test"))
    implementation(kotlin("test"))
    testImplementation("io.mockk:mockk:1.13.14")
    testImplementation ("org.jetbrains.kotlin:kotlin-test:1.5.31")
    implementation("org.jetbrains.kotlin:kotlin-reflect:2.1.0")
}


tasks.test {
    useJUnitPlatform()

    testLogging  {
        events ("passed", "skipped", "failed")
    }
}

kotlin {
    jvmToolchain(21)
}



