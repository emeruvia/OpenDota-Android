package dev.emg.opendotaapi.ui.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import dev.emg.opendotaapi.data.network.OpenDotaService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(application: Application) : AndroidViewModel(application) {

  fun getProMatches() {
    viewModelScope.launch {
      withContext(Dispatchers.IO) {
        val service = OpenDotaService.create()
        val sample = service.getProMatches()
        for (i in sample) {
          Log.d("MainViewModel", i.toString())
        }
      }
    }
  }
}