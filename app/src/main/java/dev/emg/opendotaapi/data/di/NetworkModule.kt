package dev.emg.opendotaapi.data.di

import com.squareup.moshi.Moshi
import com.squareup.moshi.Moshi.Builder
import com.squareup.moshi.adapters.Rfc3339DateJsonAdapter
import dagger.Module
import dagger.Provides
import dev.emg.opendotaapi.data.network.OpenDotaService
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.Date
import javax.inject.Singleton

@Module
object NetworkModule {

  @Provides
  @Singleton
  fun providesOpenDotaApiService(): OpenDotaService {
    return Retrofit.Builder()
      .addConverterFactory(MoshiConverterFactory.create())
      .baseUrl(OpenDotaService.BASE_URL)
      .build()
      .create(OpenDotaService::class.java)
  }

  @Provides
  @Singleton
  fun providesMoshi(): Moshi {
    return Builder()
      .add(
        Date::class.java,
        Rfc3339DateJsonAdapter()
      )
      .build()
  }

}