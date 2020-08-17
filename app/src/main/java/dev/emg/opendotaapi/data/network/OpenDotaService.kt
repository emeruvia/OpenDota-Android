package dev.emg.opendotaapi.data.network

import dev.emg.opendotaapi.data.model.Match
import dev.emg.opendotaapi.data.model.ProPlayer
import retrofit2.http.GET

interface OpenDotaService {

  // Pro Matches
  @GET("proMatches")
  suspend fun proMatches(): List<Match>

  @GET("proPlayers")
  suspend fun proPlayers(): List<ProPlayer>

  companion object {
    const val BASE_URL: String = "https://api.opendota.com/api/"
  }
}
