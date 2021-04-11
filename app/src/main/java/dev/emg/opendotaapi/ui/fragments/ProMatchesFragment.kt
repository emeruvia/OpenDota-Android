package dev.emg.opendotaapi.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import dagger.android.support.DaggerFragment
import dev.emg.opendotaapi.R
import dev.emg.opendotaapi.databinding.FragmentProMatchesBinding
import dev.emg.opendotaapi.ui.adapters.ProMatchesAdapter
import dev.emg.opendotaapi.ui.viewmodel.MainViewModel
import javax.inject.Inject

class ProMatchesFragment : DaggerFragment() {

  private lateinit var binding: FragmentProMatchesBinding
  @Inject lateinit var viewModel: MainViewModel

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