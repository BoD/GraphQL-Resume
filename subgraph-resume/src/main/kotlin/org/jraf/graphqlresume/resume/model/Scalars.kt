package org.jraf.graphqlresume.resume.model

import graphql.GraphQLContext
import graphql.execution.CoercedVariables
import graphql.language.Value
import graphql.schema.Coercing
import graphql.schema.GraphQLScalarType
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

val Url: GraphQLScalarType = GraphQLScalarType.newScalar()
  .name("Url")
  .coercing(
    object : Coercing<Any?, Any?> {
      override fun parseValue(input: Any, graphQLContext: GraphQLContext, locale: Locale): Any {
        throw UnsupportedOperationException()
      }

      override fun parseLiteral(
        input: Value<*>,
        variables: CoercedVariables,
        graphQLContext: GraphQLContext,
        locale: Locale,
      ): Any {
        throw UnsupportedOperationException()
      }

      override fun serialize(dataFetcherResult: Any, graphQLContext: GraphQLContext, locale: Locale): Any {
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
      override fun parseValue(input: Any, graphQLContext: GraphQLContext, locale: Locale): Any {
        throw UnsupportedOperationException()
      }

      override fun parseLiteral(
        input: Value<*>,
        variables: CoercedVariables,
        graphQLContext: GraphQLContext,
        locale: Locale,
      ): Any {
        throw UnsupportedOperationException()
      }

      override fun serialize(dataFetcherResult: Any, graphQLContext: GraphQLContext, locale: Locale): Any {
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
      override fun parseValue(input: Any, graphQLContext: GraphQLContext, locale: Locale): Any {
        throw UnsupportedOperationException()
      }

      override fun parseLiteral(
        input: Value<*>,
        variables: CoercedVariables,
        graphQLContext: GraphQLContext,
        locale: Locale,
      ): Any {
        throw UnsupportedOperationException()
      }

      override fun serialize(dataFetcherResult: Any, graphQLContext: GraphQLContext, locale: Locale): Any {
        return dataFetcherResult as String
      }
    },
  )
  .build()
