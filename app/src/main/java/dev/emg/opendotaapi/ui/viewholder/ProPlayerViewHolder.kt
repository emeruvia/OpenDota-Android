package dev.emg.opendotaapi.ui.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import coil.transform.CircleCropTransformation
import dev.emg.opendotaapi.R
import dev.emg.opendotaapi.data.model.ProPlayer
import dev.emg.opendotaapi.databinding.ItemProPlayerBinding

class ProPlayerViewHolder(
  private val binding: ItemProPlayerBinding
) : RecyclerView.ViewHolder(binding.root) {

  fun bind(proPlayer: ProPlayer) {
    binding.player = proPlayer
    binding.avatar.load(proPlayer.avatarFull) {
      crossfade(true)
      placeholder(R.color.cardview_dark_background)
      transformations(CircleCropTransformation())
    }
  }

  companion object {
    fun from(parent: ViewGroup): ProPlayerViewHolder {
      val layoutInflater = LayoutInflater.from(parent.context)
      val binding: ItemProPlayerBinding = DataBindingUtil.inflate(
        layoutInflater,
        R.layout.item_pro_player,
        parent,
        false
      )
      return ProPlayerViewHolder(binding)
    }
  }
}