package dev.emg.opendotaapi.data.model

import androidx.room.Entity
import com.squareup.moshi.Json

@Entity
data class Player(
  @field:Json(name = "tracked_until") val trackedUntil: String? = null,
  @field:Json(name = "solo_competitive_rank") val soloCompetitiveRank: String? = null,
  @field:Json(name = "competitive_rank") val competitiveRank: String? = null,
  @field:Json(name = "rank_tier") val rankTier: Long = 0,
  @field:Json(name = "leaderboard_rank") val leaderboardRank: Long = 0,
  @field:Json(name = "mmr_estimate") val mmrEstimage: MMREstimate,
  @field:Json(name = "profile") val profile: PlayerProfile
)

//{
//  "tracked_until": "string",
//  "solo_competitive_rank": "string",
//  "competitive_rank": "string",
//  "rank_tier": 0,
//  "leaderboard_rank": 0,
//  "mmr_estimate": {
//  "estimate": 0,
//  "stdDev": 0,
//  "n": 0
//},

//}