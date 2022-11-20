package org.jraf.graphqlresume.identity.repository

import org.jraf.graphqlresume.identity.model.Meta
import java.text.SimpleDateFormat

object MetaRepository {
  private val meta = Meta(lastModified = SimpleDateFormat("yyyy-MM-dd ZZZ").parse("2022-11-20 UTC"))
  fun getMeta() = meta
}
