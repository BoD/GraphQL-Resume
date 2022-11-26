package org.jraf.graphqlresume.resume.model

import graphql.schema.Coercing

import graphql.schema.GraphQLScalarType
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Date as JavaDate

private val dateFormat = SimpleDateFormat("yyyy-MM-dd")

val Date: GraphQLScalarType = GraphQLScalarType.newScalar()
  .name("Date")
  .coercing(object : Coercing<Any?, Any?> {
    override fun parseValue(input: Any): Any {
      throw UnsupportedOperationException()
    }

    override fun parseLiteral(input: Any): Any {
      throw UnsupportedOperationException()
    }

    override fun serialize(dataFetcherResult: Any): Any {
      val javaDate = dataFetcherResult as JavaDate
      return dateFormat.format(javaDate)
    }
  })
  .build()

val Email: GraphQLScalarType = GraphQLScalarType.newScalar()
  .name("Email")
  .coercing(object : Coercing<Any?, Any?> {
    override fun parseValue(input: Any): Any {
      throw UnsupportedOperationException()
    }

    override fun parseLiteral(input: Any): Any {
      throw UnsupportedOperationException()
    }

    override fun serialize(dataFetcherResult: Any): Any {
      return dataFetcherResult as String
    }
  })
  .build()


data class Address(
  val addressLines: List<String>,
)

data class Identity(
  val firstName: String,
  val lastName: String,
  val birthDate: Date,
  val age: Int,
  val nationality: Nationality,
  val email: String,
  val phoneNumber: PhoneNumber,
  val address: Address,
)

data class Meta(
  val lastModified: Date,
)

enum class Nationality {
  FRANCE
}

data class PhoneNumber(
  val countryCode: Int?,
  val number: String,
)
