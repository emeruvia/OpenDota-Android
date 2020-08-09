package dev.emg.opendotaapi.ui.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import dev.emg.opendotaapi.data.Repository
import dev.emg.opendotaapi.data.model.Match
import kotlinx.coroutines.Dispatchers

class MainViewModel @ViewModelInject constructor(repository: Repository) : ViewModel() {

//  private lateinit var _repository: Repository = repository

  private val _proMatches = repository
    .getProMatches()
    .asLiveData(Dispatchers.IO + viewModelScope.coroutineContext)

  val proMatches: LiveData<List<Match>>
    get() = _proMatches

}