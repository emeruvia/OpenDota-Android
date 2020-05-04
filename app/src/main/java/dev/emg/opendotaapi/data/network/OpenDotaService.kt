package dev.emg.opendotaapi.data.network

import dev.emg.opendotaapi.data.model.Match
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface OpenDotaService {

  // Pro Matches
  @GET("proMatches")
  suspend fun getProMatches(): List<Match>

  companion object {
    private val BASE_URL: String = "https://api.opendota.com/api/"

    fun create(): OpenDotaService {
      val retrofit = Retrofit.Builder()
          .addConverterFactory(GsonConverterFactory.create())
          .baseUrl("https://api.opendota.com/api/")
          .build()
      return retrofit.create(OpenDotaService::class.java)
    }
  }

}