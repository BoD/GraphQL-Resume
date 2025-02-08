plugins {
  id("org.springframework.boot") version "3.0.0" apply false
  id("io.spring.dependency-management") version "1.1.0" apply false
  kotlin("jvm") version "2.1.10" apply false
  kotlin("plugin.spring") version "2.1.10" apply false
  id("com.apollographql.apollo") version "4.1.1" apply false
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
