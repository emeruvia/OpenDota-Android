package dev.emg.opendotaapi.data.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dev.emg.opendotaapi.data.db.OpenDotaDatabase
import dev.emg.opendotaapi.data.db.ProMatchesDao
import javax.inject.Singleton

@Module
object DatabaseModule {

  @Provides
  @Singleton
  fun providesDatabase(appContext: Context): OpenDotaDatabase {
    return Room.databaseBuilder(appContext, OpenDotaDatabase::class.java, "opendota.db").build()
  }

  @Provides
  fun providesProMatchesDao(database: OpenDotaDatabase): ProMatchesDao {
    return database.proMatchesDao()
  }
}