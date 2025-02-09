import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm")
  application
  id("com.apollographql.apollo")
}

java.sourceCompatibility = JavaVersion.VERSION_17

dependencies {
  implementation("com.apollographql.apollo:apollo-runtime:4.1.1")
  implementation("org.jetbrains.kotlinx:kotlinx-html:0.12.0")
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    freeCompilerArgs = listOf("-Xjsr305=strict")
    jvmTarget = "17"
  }
}

tasks.withType<Test> {
  useJUnitPlatform()
}

apollo {
  service("resume") {
    packageName.set("org.jraf.graphqlresume.htmlgenerator")
    introspection {
      // For local router
      endpointUrl.set("http://localhost:4000/")

//      // For prod
//      endpointUrl.set("http://server.jraf.org:4000/")

      schemaFile.set(file("src/main/graphql/schema.graphqls"))
    }
    mapScalarToKotlinString("Url")
    mapScalarToKotlinString("Email")
  }
}

application {
  mainClass.set("org.jraf.graphqlresume.htmlgenerator.HtmlGeneratorApplicationKt")
  applicationDefaultJvmArgs = listOf("-Xms16m", "-Xmx128m")
}
