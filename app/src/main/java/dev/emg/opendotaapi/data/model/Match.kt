package dev.emg.opendotaapi.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json

@Entity
data class Match(
  @PrimaryKey
  @field:Json(name = "match_id") val matchId: Long,
  @field:Json(name = "player_slot") var playerSlot: Long? = -1,
  @field:Json(name = "radiant_win") var radiantWin: Boolean? = false,
  @field:Json(name = "duration") var duration: Long? = -1,
  @field:Json(name = " game_mode") var gameMode: Long? = -1,
  @field:Json(name = "lobby_type") var lobbyType: Long? = -1,
  @field:Json(name = "hero_id") var heroId: Long? = -1,
  @field:Json(name = "start_time") var startTime: Long? = -1,
  @field:Json(name = "version") var version: Long? = -1,
  @field:Json(name = "kills") var kills: Long? = -1,
  @field:Json(name = "deaths") var deaths: Long? = -1,
  @field:Json(name = "assists") var assists: Long? = -1,
  @field:Json(name = "skill") var skill: Long? = -1,
  @field:Json(name = "lane") var lane: Long? = -1,
  @field:Json(name = "lane_role") var laneRole: Long? = -1,
  @field:Json(name = "is_roaming") var isRoaming: Boolean? = false,
  @field:Json(name = "cluster") var cluster: Long? = -1,
  @field:Json(name = "leaver_status") var leaverStatus: Long? = -1,
  @field:Json(name = "party_size") var partySize: Long? = -1
)
