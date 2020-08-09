package dev.emg.opendotaapi.ui

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.emg.opendotaapi.data.model.Match

class ProMatchesAdapter(private val proMatches: List<Match>) :
  RecyclerView.Adapter<ProMatchViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProMatchViewHolder {
    return ProMatchViewHolder.from(parent)
  }

  override fun getItemCount() = proMatches.size

  override fun onBindViewHolder(holder: ProMatchViewHolder, position: Int) {
    holder.bind(proMatches[position])
  }

}