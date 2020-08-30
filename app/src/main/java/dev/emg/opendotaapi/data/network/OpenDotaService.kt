package dev.emg.opendotaapi.data.network

import dev.emg.opendotaapi.data.model.LiveMatch
import dev.emg.opendotaapi.data.model.Match
import dev.emg.opendotaapi.data.model.Player
import dev.emg.opendotaapi.data.model.PlayerWinLoss
import dev.emg.opendotaapi.data.model.ProMatch
import dev.emg.opendotaapi.data.model.ProPlayer
import retrofit2.http.GET
import retrofit2.http.Path

interface OpenDotaService {

  @GET("live")
  suspend fun getLiveMatches(): List<LiveMatch>

  @GET("players/{accountId}")
  suspend fun getPlayerByAccountId(@Path("accountId") accountId: String): Player

  @GET("players/{accountId}/wl")
  suspend fun getPlayerWinLossByAccountId(@Path("accountId") accountId: String): PlayerWinLoss

  @GET("players/{accountId}/recentMatches")
  suspend fun getPlayerRecentMatchesByAccountId(@Path("accountId") accountId: String): List<Match>

  @GET("proMatches")
  suspend fun proMatches(): List<ProMatch>

  @GET("proPlayers")
  suspend fun proPlayers(): List<ProPlayer>

  companion object {
    const val BASE_URL: String = "https://api.opendota.com/api/"
    const val PLAYER_ID: String = "197799141"
  }
}

//GET /players/{account_id}/matches
//get
//GET /players/{account_id}/heroes
//get
//GET /players/{account_id}/peers
//get
//GET /players/{account_id}/pros
//get
//GET /players/{account_id}/totals
//get
//GET /players/{account_id}/counts
//get
//GET /players/{account_id}/histograms
//get
//GET /players/{account_id}/wardmap
//get
//GET /players/{account_id}/wordcloud
//get
//GET /players/{account_id}/ratings
//get
//GET /players/{account_id}/rankings