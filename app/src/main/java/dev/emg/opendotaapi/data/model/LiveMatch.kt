package dev.emg.opendotaapi.data.model

import com.squareup.moshi.Json

data class LiveMatch(
  @field:Json(name = "players") val playersList: List<Player>,
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
//"players": [
//{
//"account_id": 1010977910,
//"hero_id": 25
//},
//{
//"account_id": 241278470,
//"hero_id": 112
//},
//{
//"account_id": 12231202,
//"hero_id": 106,
//"name": "LIMMP",
//"country_code": "se",
//"fantasy_role": 4,
//"team_id": 111474,
//"team_name": "Alliance",
//"team_tag": "Alliance",
//"is_locked": true,
//"is_pro": true,
//"locked_until": null
//},
//{
//"account_id": 1051271363,
//"hero_id": 13
//},
//{
//"account_id": 874542740,
//"hero_id": 10
//},
//{
//"account_id": 137817303,
//"hero_id": 14
//},
//{
//"account_id": 86698277,
//"hero_id": 110,
//"name": "33",
//"country_code": "il",
//"fantasy_role": 1,
//"team_id": 0,
//"team_name": "test",
//"team_tag": "",
//"is_locked": true,
//"is_pro": true,
//"locked_until": null
//},
//{
//"account_id": 127617979,
//"hero_id": 6,
//"name": "Crystallis",
//"country_code": "nl",
//"fantasy_role": 1,
//"team_id": 7684041,
//"team_name": "B8",
//"team_tag": "B8",
//"is_locked": true,
//"is_pro": true,
//"locked_until": null
//},
//{
//"account_id": 84429681,
//"hero_id": 45,
//"name": "Moo",
//"country_code": "us",
//"fantasy_role": 1,
//"team_id": 7681441,
//"team_name": "business associates",
//"team_tag": "business",
//"is_locked": true,
//"is_pro": true,
//"locked_until": null
//},
//{
//"account_id": 78651939,
//"hero_id": 71,
//"name": "Tirs",
//"country_code": "",
//"fantasy_role": 0,
//"team_id": 7754653,
//"team_name": "HF.esports",
//"team_tag": "HF",
//"is_locked": true,
//"is_pro": true,
//"locked_until": null
//}
//],
//"building_state": 16713361,
//"custom_game_difficulty": 0