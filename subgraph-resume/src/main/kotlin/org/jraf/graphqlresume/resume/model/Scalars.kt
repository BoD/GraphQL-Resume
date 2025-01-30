package org.jraf.graphqlresume.resume.model

import graphql.schema.Coercing
import graphql.schema.GraphQLScalarType
import java.text.SimpleDateFormat
import java.util.Date

val Url: GraphQLScalarType = GraphQLScalarType.newScalar()
  .name("Url")
  .coercing(
    object : Coercing<Any?, Any?> {
      override fun parseValue(input: Any): Any {
        throw UnsupportedOperationException()
      }

      override fun parseLiteral(input: Any): Any {
        throw UnsupportedOperationException()
      }

      override fun serialize(dataFetcherResult: Any): Any {
        return dataFetcherResult as String
      }
    },
  )
  .build()


private val dateFormat = SimpleDateFormat("yyyy-MM-dd")

val Date: GraphQLScalarType = GraphQLScalarType.newScalar()
  .name("Date")
  .coercing(
    object : Coercing<Any?, Any?> {
      override fun parseValue(input: Any): Any {
        throw UnsupportedOperationException()
      }

      override fun parseLiteral(input: Any): Any {
        throw UnsupportedOperationException()
      }

      override fun serialize(dataFetcherResult: Any): Any {
        val javaDate = dataFetcherResult as Date
        return dateFormat.format(javaDate)
      }
    },
  )
  .build()

val Email: GraphQLScalarType = GraphQLScalarType.newScalar()
  .name("Email")
  .coercing(
    object : Coercing<Any?, Any?> {
      override fun parseValue(input: Any): Any {
        throw UnsupportedOperationException()
      }

      override fun parseLiteral(input: Any): Any {
        throw UnsupportedOperationException()
      }

      override fun serialize(dataFetcherResult: Any): Any {
        return dataFetcherResult as String
      }
    },
  )
  .build()
