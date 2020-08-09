package dev.emg.opendotaapi.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import dev.emg.opendotaapi.data.model.Match

@Database(entities = [Match::class], version = 1, exportSchema = false)
abstract class OpenDotaDatabase : RoomDatabase() {

  abstract fun proMatchesDao(): ProMatchesDao

}