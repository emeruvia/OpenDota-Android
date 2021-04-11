package dev.emg.opendotaapi.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.observe
import dagger.android.support.DaggerAppCompatActivity
import dev.emg.opendotaapi.databinding.ActivityMainBinding
import dev.emg.opendotaapi.ui.fragments.LiveMatchesFragment
import dev.emg.opendotaapi.ui.fragments.ProMatchesFragment
import dev.emg.opendotaapi.ui.fragments.ProPlayersFragment
import dev.emg.opendotaapi.ui.viewmodel.MainViewModel
import timber.log.Timber
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

  private lateinit var binding: ActivityMainBinding
  @Inject lateinit var viewModel: MainViewModel

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    val view = binding.root
    setContentView(view)

    viewModel.player.observe(this) {
      Timber.d("Player -> $it")
    }
    viewModel.playerWinLoss.observe(this) {
      Timber.d("Player Win -> ${it.win}, Loss -> ${it.loss}")
    }
    viewModel.playerRecentMatches.observe(this) {
      Timber.d("Player recent match -> ${it[0]}")
    }


    binding.liveMatchesBtn.setOnClickListener { navigateToLiveMatches() }
    binding.proMatchesBtn.setOnClickListener { navigateToProMatches() }
    binding.proPlayersBtn.setOnClickListener { navigateToProPlayers() }
  }

  private fun navigateToLiveMatches() {
    supportFragmentManager.beginTransaction()
      .add(binding.container.id, LiveMatchesFragment())
      .commitAllowingStateLoss()
  }

  private fun navigateToProMatches() {
    supportFragmentManager.beginTransaction()
      .add(binding.container.id, ProMatchesFragment())
      .commitAllowingStateLoss()
  }

  private fun navigateToProPlayers() {
    supportFragmentManager.beginTransaction()
      .add(binding.container.id, ProPlayersFragment())
      .commitAllowingStateLoss()
  }
}
