plugins {
    application
    id("checkstyle")
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
group = "hexlet.code"
version = "1.0-SNAPSHOT"


application { mainClass.set("hexlet.code.App") }

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.commons:commons-lang3:3.14.0")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

}

tasks.test {
    useJUnitPlatform()
}