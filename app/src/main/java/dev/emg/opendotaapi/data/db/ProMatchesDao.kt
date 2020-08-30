package dev.emg.opendotaapi.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update
import dev.emg.opendotaapi.data.model.ProMatch

@Dao
interface ProMatchesDao {

  @Insert
  fun insertProMatch(match: ProMatch)

  @Insert
  fun insertAll(matches: List<ProMatch>)

  @Update
  fun update(matches: List<ProMatch>)

}