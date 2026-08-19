pluginManagement {
  repositories {
    maven { url = uri("https://repo.spring.io/milestone") }
    gradlePluginPortal()
  }
}

plugins {
  id("de.fayard.refreshVersions") version "0.60.6"
}

rootProject.name = "graphql-resume"

include(
  "subgraph-resume",
  "subgraph-organizations",
  "html-generator",
)
