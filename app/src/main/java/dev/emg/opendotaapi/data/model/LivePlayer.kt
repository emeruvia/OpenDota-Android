package dev.emg.opendotaapi.data.model

import com.squareup.moshi.Json

data class LivePlayer(
  @field:Json(name = "account_id") val accountId: Long,
  @field:Json(name = "hero_id") val heroId: Long,
  @field:Json(name = "name") val name: String? = null,
  @field:Json(name = "country_code") val countryCode: String? = null,
  @field:Json(name = "fantasy_role") val fantasyRole: String? = null,
  @field:Json(name = "team_id") val teamId: Long = 0,
  @field:Json(name = "team_name") val teamName: String? = null,
  @field:Json(name = "team_tag") val teamTag: String? = null,
  @field:Json(name = "is_locked") val isLocked: Boolean = false,
  @field:Json(name = "is_pro") val isPro: Boolean = false,
  @field:Json(name = "locked_until") val lockedUntil: String? = null
)