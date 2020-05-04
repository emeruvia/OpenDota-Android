package dev.emg.opendotaapi.data.model

data class Match(
  var match_id: Long,
  var duration: Long,
  var start_time: Long,
  var radiant_team_id: Long,
  var radiant_name: String,
  var dire_team_id: Long,
  var dire_name: String,
  var leagueid: Long,
  var league_name: String,
  var series_id: Long,
  var series_type: Long,
  var radiant_score: Long,
  var dire_score: Long,
  var radiant_win: Boolean,
  var radiant: Boolean
) {

  override fun toString(): String {
    return "Match: id=$match_id, $radiant_name VS $dire_name"
  }
}
