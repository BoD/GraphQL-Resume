package org.jraf.graphqlresume.resume.repository

import org.jraf.graphqlresume.resume.model.Meta
import java.text.SimpleDateFormat

object MetaRepository {
  private val meta = Meta(lastModified = SimpleDateFormat("yyyy-MM-dd ZZZ").parse("2022-11-20 UTC"))
  fun getMeta() = meta
}
