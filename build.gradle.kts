plugins {
    id("java")
}

group = "com.javakeanu"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()

    // Menampilkan hasil test di console
    testLogging {
        events("passed", "skipped", "failed")  // tampilkan event ini
        showStandardStreams = true              // tampilkan output System.out.println
        exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL // tampilkan full error kalau ada
    }

    // Atur supaya hasil tes disimpan sebagai laporan HTML
    reports {
        html.required.set(true) // aktifkan report HTML
        junitXml.required.set(true) // aktifkan report XML juga (optional)
    }
}
