plugins {
    java
    `maven-publish`

   // id("com.github.johnrengelman.shadow") version "8.1.1"//"6.1.0"
}
group = "br.com.eduard"
version = "2.0"

java.sourceCompatibility = JavaVersion.VERSION_21
java.targetCompatibility = JavaVersion.VERSION_21

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    compileOnly( "org.projectlombok:lombok:1.18.34")
    annotationProcessor ("org.projectlombok:lombok:1.18.34")
    testCompileOnly("junit", "junit", "4.12")
    compileOnly("com.google.code.gson:gson:2.11.0")
    //testCompile("org.bukkit:spigot:1.8.9")

}


publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "br.com.eduard"
            artifactId = "java_utils"
            version = project.version as String
            from(components["java"])
        }
    }
}
