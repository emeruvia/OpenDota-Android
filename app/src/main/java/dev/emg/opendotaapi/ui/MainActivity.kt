package dev.emg.opendotaapi.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import dev.emg.opendotaapi.R
import dev.emg.opendotaapi.data.network.OpenDotaService
import dev.emg.opendotaapi.ui.viewmodel.MainViewModel
import dev.emg.opendotaapi.ui.viewmodel.MainViewModelFactory
import kotlinx.android.synthetic.main.activity_main.button
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

  private lateinit var mainViewModel: MainViewModel

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    mainViewModel = ViewModelProvider(this, MainViewModelFactory(application))
      .get(MainViewModel::class.java)

    button.setOnClickListener {
      mainViewModel.getProMatches()
    }
  }

}
