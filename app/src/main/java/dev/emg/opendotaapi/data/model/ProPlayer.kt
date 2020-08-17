package dev.emg.opendotaapi.data.model

import androidx.room.Entity
import com.squareup.moshi.Json
import java.util.Date

@Entity
data class ProPlayer(
  @field:Json(name = "account_id") val accountId: Int,
//  @field:Json(name = "steamid") val steamId: String,
  @field:Json(name = "avatar") val avatar: String?,
  @field:Json(name = "avatarmedium") val avatarMedium: String?,
  @field:Json(name = "avatarfull") val avatarFull: String?,
//  @field:Json(name = "profileurl") val profileUrl: String,
  @field:Json(name = "personname") val personName: String?,
//  @field:Json(name = "last_login") val lastLogin: Date?,
//  @field:Json(name = "full_history_time") val fullHistoryTime: Date?,
//  @field:Json(name = "cheese") val cheese: Int,
//  @field:Json(name = "fh_unavailable") val fh_unavailable: Boolean,
//  @field:Json(name = "loccountrycode") val localCountryCode: String,
//  @field:Json(name = "last_match_time") val lastMatchTime: Date?,
//  @field:Json(name = "plus") val plus: Boolean,
  @field:Json(name = "name") val nickName: String?,
//  @field:Json(name = "country_code") val countryCode: String,
//  @field:Json(name = "fantasy_role") val fantasyRole: String,
//  @field:Json(name = "team_id") val teamId: String,
  @field:Json(name = "team_name") val teamName: String?
//  @field:Json(name = "team_tag") val teamTag: String,
//  @field:Json(name = "is_locked") val isLocked: Boolean,
//  @field:Json(name = "is_pro") val isPro: Boolean,
//  @field:Json(name = "locked_until") val lockedUntil: Int?
)
