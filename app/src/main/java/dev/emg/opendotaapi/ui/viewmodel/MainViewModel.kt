package dev.emg.opendotaapi.ui.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import dev.emg.opendotaapi.data.Repository
import dev.emg.opendotaapi.data.model.LiveMatch
import dev.emg.opendotaapi.data.model.Match
import dev.emg.opendotaapi.data.model.ProPlayer
import kotlinx.coroutines.Dispatchers

class MainViewModel @ViewModelInject constructor(repository: Repository) : ViewModel() {

  private val context = Dispatchers.IO + viewModelScope.coroutineContext

  val liveMatches: LiveData<List<LiveMatch>> = Transformations.map(
    repository.getLiveMatches().asLiveData(context)
  ) { it }

  val proMatches: LiveData<List<Match>> = Transformations.map(
    repository.getProMatches().asLiveData(context)
  ) { it }

  val proPlayer: LiveData<List<ProPlayer>> = Transformations.map(
    repository.getProPlayers().asLiveData(context)
  ) { it }
}