plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation("com.github.pengrad:java-telegram-bot-api:5.5.0")
    implementation("com.google.cloud.functions:functions-framework-api:1.0.1")
    compileOnly("com.google.cloud.functions:functions-framework-api")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

