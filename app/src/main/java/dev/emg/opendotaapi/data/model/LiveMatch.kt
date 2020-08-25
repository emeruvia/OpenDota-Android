package dev.emg.opendotaapi.data.model

import com.squareup.moshi.Json

data class LiveMatch(
  @field:Json(name = "players") val playersList: List<LivePlayer>,
  @field:Json(name = "activate_time") val activateTime: Long,
  @field:Json(name = "deactivate_time") val deactivateTime: Long,
  @field:Json(name = "server_steam_id") val serverSteamId: String,
  @field:Json(name = "lobby_id") val lobbyId: Long,
  @field:Json(name = "lobby_type") val lobbyType: Long,
  @field:Json(name = "game_time") val gameTime: Long,
  @field:Json(name = "delay") val delay: Long,
  @field:Json(name = "spectators") val spectators: Long,
  @field:Json(name = "game_mode") val gameMode: Long,
  @field:Json(name = "average_mmr") val averageMmr: Long,
  @field:Json(name = "match_id") val matchId: Long,
  @field:Json(name = "series_id") val seriesId: Long,
  @field:Json(name = "sort_score") val sortScore: Long,
  @field:Json(name = "last_update_time") val lastUpdateTime: Long,
  @field:Json(name = "radiant_lead") val radiantLead: Long,
  @field:Json(name = "radiant_score") val radiantScore: Long,
  @field:Json(name = "dire_score") val direScore: Long,
  @field:Json(name = "building_state") val buildingState: Long,
  @field:Json(name = "custom_game_difficulty") val customGameDifficulty: Long
)