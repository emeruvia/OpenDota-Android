package dev.emg.opendotaapi.ui.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.emg.opendotaapi.data.model.ProMatch
import dev.emg.opendotaapi.ui.viewholder.ProMatchViewHolder

class ProMatchesAdapter(
  private val proMatches: List<ProMatch>
) : RecyclerView.Adapter<ProMatchViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProMatchViewHolder {
    return ProMatchViewHolder.from(parent)
  }

  override fun getItemCount() = proMatches.size

  override fun onBindViewHolder(holder: ProMatchViewHolder, position: Int) {
    holder.bind(proMatches[position])
  }

}