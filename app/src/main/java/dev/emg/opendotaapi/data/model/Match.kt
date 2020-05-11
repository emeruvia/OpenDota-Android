package dev.emg.opendotaapi.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = Match.TABLE_NAME)
data class Match(
  @PrimaryKey
  @ColumnInfo(name = "match_id") var match_id: Long,
  @ColumnInfo(name = "duration") var duration: Long,
  @ColumnInfo(name = "start_time") var start_time: Long,
  @ColumnInfo(name = "radiant_team_id") var radiant_team_id: Long,
  @ColumnInfo(name = "radiant_name") var radiant_name: String,
  @ColumnInfo(name = "dire_team_id") var dire_team_id: Long,
  @ColumnInfo(name = "dire_name") var dire_name: String,
  @ColumnInfo(name = "leagueid") var leagueid: Long,
  @ColumnInfo(name = "league_name") var league_name: String,
  @ColumnInfo(name = "series_id") var series_id: Long,
  @ColumnInfo(name = "series_type") var series_type: Long,
  @ColumnInfo(name = "radiant_score") var radiant_score: Long,
  @ColumnInfo(name = "dire_score") var dire_score: Long,
  @ColumnInfo(name = "radiant_win") var radiant_win: Boolean,
  @ColumnInfo(name = "radiant") var radiant: Boolean
) {

  override fun toString(): String {
    return "Match: id=$match_id, $radiant_name VS $dire_name"
  }

  companion object {
    const val TABLE_NAME = "match_table"
  }
}
