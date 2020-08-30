package dev.emg.opendotaapi.ui.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import dev.emg.opendotaapi.data.Repository
import dev.emg.opendotaapi.data.model.LiveMatch
import dev.emg.opendotaapi.data.model.Match
import dev.emg.opendotaapi.data.model.Player
import dev.emg.opendotaapi.data.model.PlayerWinLoss
import dev.emg.opendotaapi.data.model.ProMatch
import dev.emg.opendotaapi.data.model.ProPlayer
import dev.emg.opendotaapi.data.network.OpenDotaService
import kotlinx.coroutines.Dispatchers

class MainViewModel @ViewModelInject constructor(repository: Repository) : ViewModel() {

  private val context = Dispatchers.IO + viewModelScope.coroutineContext

  val accountId: LiveData<String> = MutableLiveData<String>(OpenDotaService.PLAYER_ID)

  val player: LiveData<Player> = Transformations.map(
    repository.getPlayer(accountId.value!!).asLiveData(context)
  ) { it }

  val playerWinLoss: LiveData<PlayerWinLoss> = Transformations.distinctUntilChanged(
    Transformations.map(
      repository.getPlayerWinLoss(accountId.value!!).asLiveData(context)
    ) { it }
  )

  val playerRecentMatches: LiveData<List<Match>> = Transformations.distinctUntilChanged(
    Transformations.map(
      repository.getPlayerRecentMatches(accountId.value!!).asLiveData(context)
    ) { it }
  )

  val liveMatches: LiveData<List<LiveMatch>> = Transformations.map(
    repository.getLiveMatches().asLiveData(context)
  ) { it }

  val proMatches: LiveData<List<ProMatch>> = Transformations.map(
    repository.getProMatches().asLiveData(context)
  ) { it }

  val proPlayer: LiveData<List<ProPlayer>> = Transformations.map(
    repository.getProPlayers().asLiveData(context)
  ) { it }
}