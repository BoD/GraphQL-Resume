package org.jraf.graphqlresume.resume.repository

import org.jraf.graphqlresume.resume.model.Language
import org.jraf.graphqlresume.resume.model.SkillCategory
import org.jraf.graphqlresume.resume.model.SkillItem

object SkillsRepository {
  private val englishSkillCategories = listOf(
    SkillCategory(
      name = "Development",
      items = listOf(
        SkillItem("Excellent knowledge of the Android platform."),
        SkillItem("Excellent knowledge of the Kotlin and Java languages."),
        SkillItem("Experience with C#, C++, and C."),
        SkillItem("IntelliJ/AS and Eclipse environments."),
        SkillItem("Other skills: Shell, Perl, TCL, Pascal, Ada, assembly language."),
      ),
    ),
    SkillCategory(
      name = "Server-side and web",
      items = listOf(
        SkillItem("Frameworks: KTOR, JSP/Servlets, Struts, Turbine."),
        SkillItem("Very good knowledge of HTML, CSS, Javascript, XML, XSL/T."),
        SkillItem("Other skills: GraphQL, FreeMarker, PHP, Flash, Applets."),
      ),
    ),
    SkillCategory(
      name = "Databases",
      items = listOf(
        SkillItem("SQL language; Oracle, MySQL and SQLite."),
        SkillItem("JPA, Hibernate, JDBC, Realm."),
      ),
    ),
    SkillCategory(
      name = "Concepts",
      items = listOf(
        SkillItem("Design Patterns; Clean Architecture; UML."),
      ),
    ),
    SkillCategory(
      name = "Operating Systems",
      items = listOf(
        SkillItem("Good knowledge of Linux / Unix; MacOS; Windows."),
      ),
    ),
    SkillCategory(
      name = "Languages",
      items = listOf(
        SkillItem("English: fluent."),
        SkillItem("French: native language."),
      ),
    ),
  )

  private val frenchSkillCategories = listOf(
    SkillCategory(
      name = "Programmation",
      items = listOf(
        SkillItem("Maîtrise de la plateforme Android."),
        SkillItem("Maîtrise des langages Kotlin et Java."),
        SkillItem("Connaissance des langages C#, C++, C."),
        SkillItem("Environnements IntelliJ/AS et Eclipse."),
        SkillItem("Autres connaissances : Shell, Perl, TCL, Pascal, Ada, assembleur."),
      ),
    ),
    SkillCategory(
      name = "Côté serveur et web",
      items = listOf(
        SkillItem("Frameworks: KTOR, JSP/Servlets, Struts, Turbine."),
        SkillItem("Très bonne connaissance de HTML, CSS, Javascript, XML, XSL/T."),
        SkillItem("Autres connaissances : GraphQL, FreeMarker, PHP, Flash, Applets."),
      ),
    ),
    SkillCategory(
      name = "Bases de données",
      items = listOf(
        SkillItem("Langage SQL ; Oracle, MySQL et SQLite."),
        SkillItem("JPA, Hibernate, JDBC, Realm."),
      ),
    ),
    SkillCategory(
      name = "Concepts",
      items = listOf(
        SkillItem("Design Patterns ; Clean Architecture ; UML."),
      ),
    ),
    SkillCategory(
      name = "Systèmes d'exploitation",
      items = listOf(
        SkillItem("Bonne connaissance de Linux / Unix ; MacOS ; Windows."),
      ),
    ),
    SkillCategory(
      name = "Anglais",
      items = listOf(
        SkillItem("Courant écrit et oral."),
      ),
    ),
  )

  fun getSkills(language: Language): List<SkillCategory> {
    return when (language) {
      Language.EN -> englishSkillCategories
      Language.FR -> frenchSkillCategories
    }
  }
}
