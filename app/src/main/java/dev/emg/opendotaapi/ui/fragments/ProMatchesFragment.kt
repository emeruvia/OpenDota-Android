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
import dev.emg.opendotaapi.databinding.FragmentProMatchesBinding
import dev.emg.opendotaapi.ui.ProMatchesAdapter
import dev.emg.opendotaapi.ui.viewmodel.MainViewModel

@AndroidEntryPoint
class ProMatchesFragment : Fragment() {

  private lateinit var binding: FragmentProMatchesBinding
  private val viewModel by activityViewModels<MainViewModel>()

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    binding = DataBindingUtil.inflate(inflater, R.layout.fragment_pro_matches, container, false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    viewModel.proMatches.observe(viewLifecycleOwner) { list ->
      val adapter = ProMatchesAdapter(list)
      binding.recyclerview.adapter = adapter
    }
  }
}