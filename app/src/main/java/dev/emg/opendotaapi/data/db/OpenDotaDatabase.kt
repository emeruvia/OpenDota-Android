package dev.emg.opendotaapi.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import dev.emg.opendotaapi.data.model.ProMatch
import dev.emg.opendotaapi.data.utils.Converters

@Database(entities = [ProMatch::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class OpenDotaDatabase : RoomDatabase() {

  abstract fun proMatchesDao(): ProMatchesDao

}