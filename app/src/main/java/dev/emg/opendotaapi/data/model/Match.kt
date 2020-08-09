package dev.emg.opendotaapi.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Entity(tableName = Match.TABLE_NAME)
data class Match(
  @PrimaryKey
  @SerializedName("match_id") var matchId: Long,
  @SerializedName("duration") var duration: Long,
  @SerializedName("start_time") var startTime: Long,
  @SerializedName("radiant_team_id") var radiantTeamId: Long,
  @SerializedName("radiant_name") var radiantName: String,
  @SerializedName("dire_team_id") var direTeamId: Long,
  @SerializedName("dire_name") var direName: String,
  @SerializedName("leagueid") var leagueId: Long,
  @SerializedName("league_name") var leagueName: String,
  @SerializedName("series_id") var seriesId: Long,
  @SerializedName("series_type") var seriesType: Long,
  @SerializedName("radiant_score") var radiantScore: Long,
  @SerializedName("dire_score") var direScore: Long,
  @SerializedName("radiant_win") var radiantWin: Boolean,
  @SerializedName("radiant") var radiant: Boolean
) : Serializable {

  override fun toString(): String {
    return "Match: id=$matchId, $radiantName VS $direName"
  }

  companion object {
    const val TABLE_NAME = "match_table"
  }
}
