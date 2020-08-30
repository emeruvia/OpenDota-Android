package dev.emg.opendotaapi.data.model

import com.squareup.moshi.Json

data class PlayerWinLoss(
  @field:Json(name = "win") val win: Int = -1,
  @field:Json(name = "lose") val loss: Int = -1
)