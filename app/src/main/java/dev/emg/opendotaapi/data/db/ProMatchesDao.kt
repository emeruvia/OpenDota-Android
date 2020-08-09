package dev.emg.opendotaapi.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update
import dev.emg.opendotaapi.data.model.Match

@Dao
interface ProMatchesDao {

  @Insert
  fun insertMatch(match: Match)

  @Insert
  fun insertAll(matches: List<Match>)

  @Update
  fun update(matches: List<Match>)

}