package dev.emg.opendotaapi.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import dagger.android.support.DaggerFragment
import dev.emg.opendotaapi.R
import dev.emg.opendotaapi.databinding.FragmentLiveMatchesBinding
import dev.emg.opendotaapi.ui.viewmodel.MainViewModel
import timber.log.Timber
import javax.inject.Inject

class LiveMatchesFragment : DaggerFragment() {

  private lateinit var binding: FragmentLiveMatchesBinding
  @Inject lateinit var viewModel: MainViewModel

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    // Inflate the layout for this fragment
    binding = DataBindingUtil.inflate(
      inflater,
      R.layout.fragment_live_matches,
      container,
      false
    )
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    viewModel.liveMatches.observe(viewLifecycleOwner) { list ->
      list.map { Timber.d("LiveMatch: $it") }
    }
  }
}