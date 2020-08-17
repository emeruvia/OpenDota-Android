package dev.emg.opendotaapi.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json

@Entity(tableName = Match.TABLE_NAME)
data class Match(
  @PrimaryKey
  @field:Json(name = "match_id") var matchId: Long,
  @field:Json(name = "duration") var duration: Long,
  @field:Json(name = "start_time") var startTime: Long,
  @field:Json(name = "radiant_team_id") var radiantTeamId: Long,
  @field:Json(name = "radiant_name") var radiantName: String,
  @field:Json(name = "dire_team_id") var direTeamId: Long,
  @field:Json(name = "dire_name") var direName: String,
  @field:Json(name = "leagueid") var leagueId: Long,
  @field:Json(name = "league_name") var leagueName: String,
  @field:Json(name = "series_id") var seriesId: Long,
  @field:Json(name = "series_type") var seriesType: Long,
  @field:Json(name = "radiant_score") var radiantScore: Long,
  @field:Json(name = "dire_score") var direScore: Long,
  @field:Json(name = "radiant_win") var radiantWin: Boolean,
  @field:Json(name = "radiant") var radiant: Boolean
) {

  override fun toString(): String {
    return "Match: id=$matchId, $radiantName VS $direName"
  }

  companion object {
    const val TABLE_NAME = "match_table"
  }
}
