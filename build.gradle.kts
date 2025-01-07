plugins {
    kotlin("jvm") version "2.0.21"
    application
    // SQLDelight Plugin
    id("app.cash.sqldelight") version "2.0.2"
}

group = "org.crevolika"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}

dependencies {
    val koin_version = "4.0.1"

    implementation("org.junit.jupiter:junit-jupiter:5.11.4")
    testImplementation(kotlin("test"))
    implementation(kotlin("test"))
    testImplementation("io.mockk:mockk:1.13.14")
    testImplementation ("org.jetbrains.kotlin:kotlin-test:1.5.31")
    implementation("org.jetbrains.kotlin:kotlin-reflect:2.1.0")
    //runtimeOnly("com.h2database:h2:x.y.zzz")
    // latest version you can find https://firebase.google.com/docs/android/android-play-services
/*    implementation("com.google.firebase:firebase-firestore-ktx:24.7.0")
    implementation("androidx.core:core-ktx:1.10.1")*/
    implementation("app.cash.sqldelight:sqlite-driver:2.0.2")
    testImplementation(kotlin("test"))

    implementation("io.insert-koin:koin-core:$koin_version")
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

// SQLDelight Configuration
sqldelight {
    databases {
        // Schema name
        create("Database") {
            // Package name
            packageName.set("dev.hyperskill.sqldelight")
        }
    }
}



