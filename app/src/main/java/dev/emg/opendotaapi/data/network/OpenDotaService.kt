package dev.emg.opendotaapi.data.network

import dev.emg.opendotaapi.data.model.Match
import retrofit2.http.GET

interface OpenDotaService {

  // Pro Matches
  @GET("proMatches")
  suspend fun getProMatches(): List<Match>

  companion object {
    const val BASE_URL: String = "https://api.opendota.com/api/"
  }
}
