pluginManagement {
  repositories {
    maven { url = uri("https://repo.spring.io/milestone") }
    gradlePluginPortal()
  }
}
rootProject.name = "graphql-resume"

include(
  "subgraph-resume",
  "subgraph-organizations",
)
