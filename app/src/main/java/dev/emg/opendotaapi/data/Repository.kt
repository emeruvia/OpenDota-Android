package dev.emg.opendotaapi.data

import dev.emg.opendotaapi.data.model.LiveMatch
import dev.emg.opendotaapi.data.model.Match
import dev.emg.opendotaapi.data.model.ProPlayer
import dev.emg.opendotaapi.data.network.OpenDotaService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Repository @Inject constructor(private val openDotaService: OpenDotaService) {

  fun getLiveMatches(): Flow<List<LiveMatch>> = flow {
    emit(openDotaService.getLiveMatches())
  }

  fun getProMatches(): Flow<List<Match>> = flow {
    emit(openDotaService.proMatches())
  }

  fun getProPlayers(): Flow<List<ProPlayer>> = flow {
    emit(openDotaService.proPlayers())
  }

}