plugins {
    id("java")
    id("application")
}

group = "org.zoo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.11.4"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}
application{
    mainClass = "org.zoo.ZooDemo"
}

tasks.test {
    useJUnitPlatform()
}