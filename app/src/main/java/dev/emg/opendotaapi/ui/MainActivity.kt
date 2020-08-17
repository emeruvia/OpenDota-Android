package dev.emg.opendotaapi.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import dev.emg.opendotaapi.databinding.ActivityMainBinding
import dev.emg.opendotaapi.ui.fragments.ProMatchesFragment
import dev.emg.opendotaapi.ui.viewmodel.MainViewModel

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding
  private val viewModel: MainViewModel by viewModels()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    val view = binding.root
    setContentView(view)

    binding.proMatchesButton.setOnClickListener { navigateToProMatches() }
    binding.proPlayersButton.setOnClickListener { navigateToProPlayers() }
  }

  private fun navigateToProMatches() {
    supportFragmentManager.beginTransaction()
      .replace(binding.container.id, ProMatchesFragment())
      .commitAllowingStateLoss()
  }

  private fun navigateToProPlayers() {
    supportFragmentManager.beginTransaction()
      .replace(binding.container.id, ProMatchesFragment())
      .commitAllowingStateLoss()
  }
}
