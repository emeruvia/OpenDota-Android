package dev.emg.opendotaapi.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.AndroidEntryPoint
import dev.emg.opendotaapi.R
import dev.emg.opendotaapi.databinding.ActivityMainBinding
import dev.emg.opendotaapi.ui.viewmodel.MainViewModel
import dev.emg.opendotaapi.ui.viewmodel.MainViewModelFactory
import kotlinx.android.synthetic.main.activity_main.button

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding
  private lateinit var mainViewModel: MainViewModel

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    val view = binding.root
    setContentView(view)

    mainViewModel = ViewModelProvider(this, MainViewModelFactory(application))
      .get(MainViewModel::class.java)

    binding.button.setOnClickListener {
      mainViewModel.getProMatches()
    }
  }

}
