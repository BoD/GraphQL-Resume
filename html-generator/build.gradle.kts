import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  alias(libs.plugins.kotlin.jvm)
  application
  alias(libs.plugins.apollo)
}

java.sourceCompatibility = JavaVersion.VERSION_17

dependencies {
  implementation(libs.apollo.runtime)
  implementation(libs.kotlinx.html)
}

tasks.withType<KotlinCompile> {
  compilerOptions {
    freeCompilerArgs.add("-Xjsr305=strict")
    jvmTarget.set(JvmTarget.JVM_17)
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
