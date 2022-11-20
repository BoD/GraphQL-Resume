package org.jraf.graphqlresume.skills.repository

import org.jraf.graphqlresume.skills.model.Language
import org.jraf.graphqlresume.skills.model.MiscItem
import org.jraf.graphqlresume.skills.model.Resume
import org.jraf.graphqlresume.skills.model.SkillCategory
import org.jraf.graphqlresume.skills.model.SkillItem

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

  private val englishResume = Resume(
    skills = englishSkillCategories,
    misc = listOf(
      MiscItem(
        description = "Reading (science, science-fiction), cinema, music (bass guitar), geocaching.",
      ),
      MiscItem(
        description = "A few hobby Android apps (Play Store) and pet projects (Github).",
        links = listOf(
          "https://play.google.com/store/apps/developer?id=BoD",
          "https://github.com/BoD?tab=repositories&type=source",
        ),
      ),
    )
  )

  private val frenchResume = Resume(
    skills = frenchSkillCategories,
    misc = listOf(
      MiscItem(
        description = "Lectures (science, science-fiction), cinéma, musique (guitare basse), geocaching.",
      ),
      MiscItem(
        description = "Quelques applis Android \"hobby\" (Play Store) et projets persos (Github).",
        links = listOf(
          "https://play.google.com/store/apps/developer?id=BoD",
          "https://github.com/BoD?tab=repositories&type=source",
        ),
      ),
    )
  )

  fun getResume(language: Language): Resume {
    return when (language) {
      Language.EN -> englishResume
      Language.FR -> frenchResume
    }
  }
}
