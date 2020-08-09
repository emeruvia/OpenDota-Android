package dev.emg.opendotaapi.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dev.emg.opendotaapi.data.network.OpenDotaService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object NetworkModule {

  @Provides
  @Singleton
  fun providesOpenDotaApiService(): OpenDotaService {
    return Retrofit.Builder()
      .addConverterFactory(GsonConverterFactory.create())
      .baseUrl(OpenDotaService.BASE_URL)
      .build()
      .create(OpenDotaService::class.java)
  }

}