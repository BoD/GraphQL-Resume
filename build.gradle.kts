plugins {
  id("org.springframework.boot") version "3.0.0-RC2" apply false
  id("io.spring.dependency-management") version "1.1.0" apply false
  kotlin("jvm") version "1.7.21" apply false
  kotlin("plugin.spring") version "1.7.21" apply false
}

group = "org.jraf"
version = "1.0.0"

allprojects {
  repositories {
    mavenCentral()
    maven { url = uri("https://repo.spring.io/milestone") }
  }
}

