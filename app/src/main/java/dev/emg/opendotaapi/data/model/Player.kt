package dev.emg.opendotaapi.data.model

import androidx.room.Entity
import com.squareup.moshi.Json

@Entity
data class Player(
  @field:Json(name = "tracked_until") val trackedUntil: String? = null,
  @field:Json(name = "profile") val profile: PlayerProfile,
  @field:Json(name = "solo_competitive_rank") val soloCompetitiveRank: String? = null,
  @field:Json(name = "competitive_rank") val competitiveRank: String? = null,
  @field:Json(name = "rank_tier") val rankTier: Int = -1,
  @field:Json(name = "leaderboard_rank") val leaderBoardRank: Int? = -1,
  @field:Json(name = "mmr_estimate") val mmrEstimate: MMREstimate
)