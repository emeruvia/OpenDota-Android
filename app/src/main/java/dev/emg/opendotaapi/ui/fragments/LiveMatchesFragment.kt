package dev.emg.opendotaapi.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.observe
import dagger.hilt.android.AndroidEntryPoint
import dev.emg.opendotaapi.R
import dev.emg.opendotaapi.databinding.FragmentLiveMatchesBinding
import dev.emg.opendotaapi.ui.viewmodel.MainViewModel
import timber.log.Timber

@AndroidEntryPoint
class LiveMatchesFragment : Fragment() {

  private lateinit var binding: FragmentLiveMatchesBinding
  private val viewModel by activityViewModels<MainViewModel>()

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