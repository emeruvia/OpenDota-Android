package dev.emg.opendotaapi.data.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.emg.opendotaapi.data.db.OpenDotaDatabase
import dev.emg.opendotaapi.data.db.ProMatchesDao
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

  @Provides
  @Singleton
  fun providesDatabase(@ApplicationContext appContext: Context): OpenDotaDatabase {
    return Room.databaseBuilder(appContext, OpenDotaDatabase::class.java, "opendota.db").build()
  }

  @Provides
  fun providesProMatchesDao(database: OpenDotaDatabase): ProMatchesDao {
    return database.proMatchesDao()
  }
}