package dev.emg.opendotaapi.data.model

import com.squareup.moshi.Json

data class PlayerProfile(
  @field:Json(name = "account_id") val accountId: Long,
  @field:Json(name = "personname") val personName: String? = null,
  @field:Json(name = "name") val name: String? = null,
  @field:Json(name = "plus") val plus: Boolean = false,
  @field:Json(name = "cheese") val cheese: Long = -1,
  @field:Json(name = "steamid") val steamId: String? = null,
  @field:Json(name = "avatar") val avatar: String? = null,
  @field:Json(name = "avatarMedium") val avatarMedium: String? = null,
  @field:Json(name = "avatarFull") val avatarFull: String? = null,
  @field:Json(name = "profileurl") val profileUrl: String? = null,
  @field:Json(name = "last_login") val lastLogin: String? = null,
  @field:Json(name = "loccountrycode") val localCountryCode: String? = null,
  @field:Json(name = "is_contributor") val isContributor: Boolean = false
)
