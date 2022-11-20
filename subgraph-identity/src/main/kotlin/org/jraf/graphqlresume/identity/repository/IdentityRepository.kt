package org.jraf.graphqlresume.identity.repository

import org.jraf.graphqlresume.identity.model.Address
import org.jraf.graphqlresume.identity.model.Identity
import org.jraf.graphqlresume.identity.model.Language
import org.jraf.graphqlresume.identity.model.Nationality
import org.jraf.graphqlresume.identity.model.PhoneNumber
import org.jraf.graphqlresume.identity.model.Resume
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date

object IdentityRepository {
  private val birthDate: Date = SimpleDateFormat("yyyy-MM-dd ZZZ").parse("1978-04-27 UTC")!!

  private val englishIdentity = Identity(
    firstName = "Benoît",
    lastName = "Lubek",
    birthDate = birthDate,
    age = getAge(birthDate),
    nationality = Nationality.FRANCE,
    email = "BoD@JRAF.org",
    phoneNumber = PhoneNumber(33, "6 07 17 00 95"),
    address = Address(listOf("19 avenue de Choisy apt 4024", "75013", "Paris", "France")),
  )

  private val frenchIdentity = englishIdentity.copy(
    phoneNumber = PhoneNumber(null, "06 07 17 00 95"),
    address = Address(listOf("19 avenue de Choisy apt 4024", "75013", "Paris")),
  )

  private val englishResume = Resume(englishIdentity)
  private val frenchResume = Resume(frenchIdentity)

  @Suppress("SameParameterValue")
  private fun getAge(birthDate: Date): Int {
    val birth = Calendar.getInstance().apply { time = birthDate }
    val today = Calendar.getInstance()
    var age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR)
    if (today.get(Calendar.DAY_OF_YEAR) < birth.get(Calendar.DAY_OF_YEAR)) age--
    return age
  }

  fun getResume(language: Language): Resume {
    return when (language) {
      Language.EN -> englishResume
      Language.FR -> frenchResume
    }
  }
}
