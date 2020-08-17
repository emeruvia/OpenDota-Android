package dev.emg.opendotaapi.ui.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.emg.opendotaapi.data.model.ProPlayer
import dev.emg.opendotaapi.ui.viewholder.ProPlayerViewHolder

class ProPlayerAdapter(
  private val proPlayers: List<ProPlayer>
) : RecyclerView.Adapter<ProPlayerViewHolder>() {
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProPlayerViewHolder {
    return ProPlayerViewHolder.from(parent)
  }

  override fun getItemCount(): Int = proPlayers.size

  override fun onBindViewHolder(holder: ProPlayerViewHolder, position: Int) {
    holder.bind(proPlayers[position])
  }

}