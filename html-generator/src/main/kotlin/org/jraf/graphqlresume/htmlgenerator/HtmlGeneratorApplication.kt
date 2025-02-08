package org.jraf.graphqlresume.htmlgenerator

import com.apollographql.apollo.ApolloClient
import kotlinx.html.BODY
import kotlinx.html.HEADER
import kotlinx.html.SECTION
import kotlinx.html.a
import kotlinx.html.address
import kotlinx.html.article
import kotlinx.html.body
import kotlinx.html.br
import kotlinx.html.div
import kotlinx.html.dom.createHTMLDocument
import kotlinx.html.dom.serialize
import kotlinx.html.em
import kotlinx.html.footer
import kotlinx.html.h1
import kotlinx.html.head
import kotlinx.html.header
import kotlinx.html.hr
import kotlinx.html.html
import kotlinx.html.li
import kotlinx.html.nav
import kotlinx.html.section
import kotlinx.html.span
import kotlinx.html.strong
import kotlinx.html.title
import kotlinx.html.ul
import kotlinx.html.unsafe
import org.jraf.graphqlresume.htmlgenerator.type.Language
import java.io.File

suspend fun main() {
  ApolloClient.Builder()
    // For local router
    .serverUrl("http://localhost:4000/")
    // For prod
//    .serverUrl("http://server.jraf.org:4000/")
    .build()
    .use { apolloClient ->
      val enLanguage = Language.EN
      val enResponse = apolloClient.query(ResumeQuery(enLanguage)).execute()
      val enResume = enResponse.dataOrThrow().resume
      File("/Users/bod/Tmp/cv-en.html").writeText(html(enResume, enLanguage))

      val frLanguage = Language.FR
      val frResponse = apolloClient.query(ResumeQuery(frLanguage)).execute()
      val frResume = frResponse.dataOrThrow().resume
      File("/Users/bod/Tmp/cv-fr.html").writeText(html(frResume, frLanguage))
    }
}

private fun html(resume: ResumeQuery.Resume, language: Language): String {
  return createHTMLDocument().html {
    attributes["lang"] = when (language) {
      Language.EN -> "en"
      Language.FR -> "fr"
      else -> error()
    }

    head {
      unsafe {
        +HEAD
      }
      title {
        +when (language) {
          Language.EN -> "Resume ${resume.identity.firstName} ${resume.identity.lastName}"
          Language.FR -> "Curriculum Vitae ${resume.identity.firstName} ${resume.identity.lastName}"
          else -> error()
        }
      }
    }
    body {
      topNavigation()

      header {
        identity(resume.identity, language)

        h1 { +resume.title }
      }

      experienceSection(resume.experience, language)

      skillsSection(resume.skills, language)

      educationSection(resume.education, language)
    }
  }.serialize()
}

private fun BODY.topNavigation() {
  nav {
    ul {
      li {
        a(href = "https://jraf.org") { +"Home" }
      }
      li {
        +"Web ("
        a(href = "https://jraf.org/blubek/index.html") { +"English" }
        +" "
        a(href = "https://jraf.org/blubek/cv-fr.html") { +"French" }
        +")"
      }
      li {
        +"PDF ("
        a(href = "https://jraf.org/blubek/benoit-lubek-resume-en.pdf") { +"English" }
        +" "
        a(href = "https://jraf.org/blubek/benoit-lubek-cv-fr.pdf") { +"French" }
        +")"
      }
      li {
        +"GraphQL ("
        a(href = "TODO") { +"English" }
        +" "
        a(href = "TODO") { +"French" }
        +")"
      }
    }
    hr()
  }
}

private fun HEADER.identity(identity: ResumeQuery.Identity, language: Language) {
  div(classes = "addresses") {
    address {
      strong {
        +identity.firstName
        +" "
        +identity.lastName
      }
      identity.address.addressLines.forEach {
        br()
        +it
      }
      br()
      when (language) {
        Language.EN -> +"French nationality."
        Language.FR -> +"Nationalité française."
        else -> error()
      }
    }

    address {
      when (language) {
        Language.EN -> +"+${identity.phoneNumber.countryCode} ${identity.phoneNumber.number}"
        Language.FR -> +identity.phoneNumber.number
        else -> error()
      }
      br()
      a(href = "mailto:${identity.email}") { +identity.email }
      br()
      a(href = identity.website, target = "_blank") { +identity.website.substringAfter("//").takeWhile { it != '/' } }
    }
  }
}

private fun BODY.experienceSection(experience: List<ResumeQuery.Experience>, language: Language) {
  section {
    header {
      when (language) {
        Language.EN -> +"Employment history"
        Language.FR -> +"Expérience"
        else -> error()
      }
    }
    for (experienceItem in experience) {
      experienceItem(experienceItem, language)
    }
  }
}

private fun SECTION.experienceItem(
  experience: ResumeQuery.Experience,
  language: Language,
) {
  article {
    div {
      +experience.period.start.date
      +" - "
      if (experience.period.end.date == null) {
        when (language) {
          Language.EN -> +"Currently"
          Language.FR -> +"Actuellement"
          else -> error()
        }
      } else {
        +experience.period.end.date
      }
    }
    div {
      header {
        +experience.jobTitle
        when (language) {
          Language.EN -> +" at "
          Language.FR -> +" à "
          else -> error()
        }
        if (experience.organization.website != null) {
          a(href = experience.organization.website, target = "_blank") {
            +experience.organization.name
          }
        } else {
          +experience.organization.name
        }
        +" "
        span(classes = "company-details") {
          val moreInfo = experience.organization.moreInfo?.let { ", $it" } ?: ""
          unsafe {
            +"(${experience.organization.description}, ${experience.organization.location}$moreInfo)"
          }
        }
      }

      ul {
        for (item in experience.items) {
          li {
            unsafe {
              +item.description
            }
          }
        }

        if (experience.environment.isNotEmpty()) {
          footer {
            em {
              when (language) {
                Language.EN -> +"Environment"
                Language.FR -> +"Environnement"
                else -> error()
              }
            }
            +experience.environment.joinToString(", ")
            +"."
          }
        }
      }
    }
  }
}

private fun BODY.skillsSection(skills: List<ResumeQuery.Skill>, language: Language) {
  section(classes = "section__skills") {
    header {
      when (language) {
        Language.EN -> +"Skills"
        Language.FR -> +"Compétences"
        else -> error()
      }
    }
    for (skill in skills) {
      skillItem(skill, language)
    }
  }
}

private fun SECTION.skillItem(skill: ResumeQuery.Skill, language: Language) {
  article {
    header {
      +skill.name
    }
    ul {
      for (item in skill.items) {
        li {
          +item.description
        }
      }
    }
  }
}

private fun BODY.educationSection(education: List<ResumeQuery.Education>, language: Language) {
  section {
    header {
      when (language) {
        Language.EN -> +"Education"
        Language.FR -> +"Formation"
        else -> error()
      }
    }
    for (educationItem in education) {
      educationItem(educationItem, language)
    }
  }
}

private fun SECTION.educationItem(education: ResumeQuery.Education, language: Language) {
  article {
    div {
      if (education.periodOrYear.onPeriod != null) {
        +education.periodOrYear.onPeriod.start.date
        +" - "
        +education.periodOrYear.onPeriod.end.date!!
      } else {
        +education.periodOrYear.onYear!!.year!!
      }
    }
    ul {
      li {
        +education.degree
        if (education.institution != null) {
          when (language) {
            Language.EN -> +" at "
            Language.FR -> +" à "
            else -> error()
          }
          a(href = education.institution.website, target = "_blank") {
            +education.institution.name
          }
        }
      }
      if (education.moreInfo != null) {
        li {
          unsafe {
            +education.moreInfo
          }
        }
      }
    }
  }
}

private fun error(): Nothing = throw IllegalStateException()
