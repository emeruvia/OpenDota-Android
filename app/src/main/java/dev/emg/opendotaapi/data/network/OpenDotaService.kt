package dev.emg.opendotaapi.data.network

import dev.emg.opendotaapi.data.model.LiveMatch
import dev.emg.opendotaapi.data.model.Match
import dev.emg.opendotaapi.data.model.ProPlayer
import retrofit2.http.GET
import retrofit2.http.Path

interface OpenDotaService {

  @GET("live")
  suspend fun getLiveMatches(): List<LiveMatch>

//  @GET("players/{accountId}")
//  suspend fun getPlayerByAccountId(@Path("accountId") accountId: String): List<Player>

  // Pro Matches
  @GET("proMatches")
  suspend fun proMatches(): List<Match>

  @GET("proPlayers")
  suspend fun proPlayers(): List<ProPlayer>

  companion object {
    const val BASE_URL: String = "https://api.opendota.com/api/"
  }
}
