package dev.emg.opendotaapi.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import dev.emg.opendotaapi.R
import dev.emg.opendotaapi.data.model.Match
import dev.emg.opendotaapi.databinding.ItemPromatchBinding

class ProMatchViewHolder(private val binding: ItemPromatchBinding) :
  RecyclerView.ViewHolder(binding.root) {

  fun bind(proMatch: Match) {
    binding.proMatch = proMatch
  }

  companion object {
    fun from(parent: ViewGroup): ProMatchViewHolder {
      val inflater = LayoutInflater.from(parent.context)
      val binding: ItemPromatchBinding =
        DataBindingUtil.inflate(inflater, R.layout.item_promatch, parent, false)
      return ProMatchViewHolder(binding)
    }
  }
}