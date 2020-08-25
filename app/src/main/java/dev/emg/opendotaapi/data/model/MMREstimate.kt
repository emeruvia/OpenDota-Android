package dev.emg.opendotaapi.data.model

import com.squareup.moshi.Json

data class MMREstimate(
  @field:Json(name = "estimate") val estimate: Long = 0,
  @field:Json(name = "stdDev") val stdDev: Long = 0,
  @field:Json(name = "n") val n: Long = 0
)
//"mmr_estimate": {
//"estimate": 0,
//"stdDev": 0,
//"n": 0