package dev.emg.opendotaapi.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import dagger.android.support.DaggerFragment
import dev.emg.opendotaapi.R
import dev.emg.opendotaapi.databinding.FragmentProPlayerBinding
import dev.emg.opendotaapi.ui.adapters.ProPlayerAdapter
import dev.emg.opendotaapi.ui.viewmodel.MainViewModel
import javax.inject.Inject

class ProPlayersFragment : DaggerFragment() {

  private lateinit var binding: FragmentProPlayerBinding
  @Inject lateinit var viewModel: MainViewModel

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    binding = DataBindingUtil.inflate(inflater, R.layout.fragment_pro_player, container, false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    viewModel.proPlayer.observe(viewLifecycleOwner) { list ->
      val adapter = ProPlayerAdapter(list)
      binding.recyclerview.adapter = adapter
    }
  }

}