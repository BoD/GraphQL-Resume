package org.jraf.graphqlresume.resume.repository

import org.jraf.graphqlresume.resume.model.Address
import org.jraf.graphqlresume.resume.model.Identity
import org.jraf.graphqlresume.resume.model.Language
import org.jraf.graphqlresume.resume.model.Nationality
import org.jraf.graphqlresume.resume.model.PhoneNumber
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
    address = Address(listOf("Lyon", "France")),
  )

  private val frenchIdentity = englishIdentity.copy(
    phoneNumber = PhoneNumber(null, "06 07 17 00 95"),
    address = Address(listOf("Lyon")),
  )

  @Suppress("SameParameterValue")
  private fun getAge(birthDate: Date): Int {
    val birth = Calendar.getInstance().apply { time = birthDate }
    val today = Calendar.getInstance()
    var age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR)
    if (today.get(Calendar.DAY_OF_YEAR) < birth.get(Calendar.DAY_OF_YEAR)) age--
    return age
  }

  fun getIdentity(language: Language): Identity {
    return when (language) {
      Language.EN -> englishIdentity
      Language.FR -> frenchIdentity
    }
  }
}
