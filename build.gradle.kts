plugins {
  alias(libs.plugins.spring.boot).apply(false)
  alias(libs.plugins.spring.dependency.management).apply(false)
  alias(libs.plugins.kotlin.jvm).apply(false)
  alias(libs.plugins.kotlin.spring).apply(false)
  alias(libs.plugins.apollo).apply(false)
}

group = "org.jraf"
version = "1.0.0"

allprojects {
  repositories {
    mavenCentral()
    maven { url = uri("https://repo.spring.io/milestone") }
  }
}

tasks.register<Exec>("dockerBuild") {
  dependsOn(subprojects.map { it.tasks.named("installDist") })
  commandLine("docker", "build", "--platform", "linux/amd64", "-t", "bodlulu/graphql-resume", ".")
}
