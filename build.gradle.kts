import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val koinVersion = "3.1.2"
val ktorVersion = "1.6.4"

plugins {
    kotlin("jvm") version "1.5.31"
    application
    id("org.jetbrains.kotlin.plugin.serialization") version "1.5.31"
}
group = "me.maksimzemlyanikin"
version = "1.0-SNAPSHOT"


repositories {
    jcenter()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/kotlinx-html/maven")
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.ktor:ktor-server-test-host:$ktorVersion")

    implementation("io.ktor:ktor-server-netty:$ktorVersion")
    implementation("io.ktor:ktor-server-core:$ktorVersion")
    implementation("io.ktor:ktor-websockets:$ktorVersion")
    implementation("ch.qos.logback:logback-classic:1.2.6")
    implementation("io.ktor:ktor-serialization:$ktorVersion")
    // Koin for Ktor
    implementation("io.insert-koin:koin-ktor:$koinVersion")
    implementation("io.insert-koin:koin-core:$koinVersion")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("ServerKt")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=true")
}