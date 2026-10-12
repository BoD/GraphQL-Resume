import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  alias(libs.plugins.spring.boot)
  alias(libs.plugins.spring.dependency.management)
  alias(libs.plugins.kotlin.jvm)
  alias(libs.plugins.kotlin.spring)
  application
}

java.sourceCompatibility = JavaVersion.VERSION_25

dependencies {
  implementation(libs.spring.boot.starter.graphql)
  implementation(libs.spring.boot.starter.web)
  implementation(libs.jackson.module.kotlin)
  implementation(libs.kotlin.reflect)
  implementation(libs.federation.graphql.java.support)
  testImplementation(libs.spring.boot.starter.test)
  testImplementation(libs.spring.webflux)
  testImplementation(libs.spring.graphql.test)
}

tasks.withType<KotlinCompile> {
  compilerOptions {
    freeCompilerArgs.add("-Xjsr305=strict")
    jvmTarget.set(JvmTarget.JVM_25)
  }
}

tasks.withType<Test> {
  useJUnitPlatform()
}

application {
  mainClass.set("org.jraf.graphqlresume.resume.ResumeApplicationKt")
  applicationDefaultJvmArgs = listOf("-Xms16m", "-Xmx128m")
}
