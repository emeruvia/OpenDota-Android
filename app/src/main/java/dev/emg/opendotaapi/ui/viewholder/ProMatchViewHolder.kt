package dev.emg.opendotaapi.ui.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import dev.emg.opendotaapi.R
import dev.emg.opendotaapi.data.model.Match
import dev.emg.opendotaapi.databinding.ItemProMatchBinding

class ProMatchViewHolder(
  private val binding: ItemProMatchBinding
) : RecyclerView.ViewHolder(binding.root) {

  fun bind(proMatch: Match) {
    binding.proMatch = proMatch
  }

  companion object {
    fun from(parent: ViewGroup): ProMatchViewHolder {
      val inflater = LayoutInflater.from(parent.context)
      val binding: ItemProMatchBinding =
        DataBindingUtil.inflate(inflater, R.layout.item_pro_match, parent, false)
      return ProMatchViewHolder(binding)
    }
  }
}