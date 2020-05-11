package dev.emg.opendotaapi.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Match(
  @PrimaryKey
  @ColumnInfo(name = "match_id") var matchId: Long,
  @ColumnInfo(name = "duration") var duration: Long,
  @ColumnInfo(name = "start_time") var startTime: Long,
  @ColumnInfo(name = "radiant_team_id") var radiantTeamId: Long,
  @ColumnInfo(name = "radiant_name") var radiantName: String,
  @ColumnInfo(name = "dire_team_id") var direTeamId: Long,
  @ColumnInfo(name = "dire_name") var direName: String,
  @ColumnInfo(name = "leagueid") var leagueId: Long,
  @ColumnInfo(name = "league_name") var leagueName: String,
  @ColumnInfo(name = "series_id") var seriesId: Long,
  @ColumnInfo(name = "series_type") var seriesType: Long,
  @ColumnInfo(name = "radiant_score") var radiantScore: Long,
  @ColumnInfo(name = "dire_score") var direScore: Long,
  @ColumnInfo(name = "radiant_win") var radiantWin: Boolean,
  @ColumnInfo(name = "radiant") var radiant: Boolean
) {

  override fun toString(): String {
    return "Match: id=$matchId, $radiantName VS $direName"
  }
}
