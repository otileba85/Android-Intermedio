package com.abel.horoscapp.ui.horoscope.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abel.horoscapp.R
import com.abel.horoscapp.domain.model.HoroscopeInfo

class HoroscopeAdapter   (private var horoscopelist: List<HoroscopeInfo> = emptyList(),
    private val onItemSelected:(HoroscopeInfo)-> Unit) :
    RecyclerView.Adapter<HoroscopeViewHolder>() {

        fun updateList(list:List<HoroscopeInfo>){
            horoscopelist = list
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoroscopeViewHolder {
        return HoroscopeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_horoscope, parent, false)
        )
    }

    override fun getItemCount() = horoscopelist.size

    override fun onBindViewHolder(holder: HoroscopeViewHolder, position: Int) {
        holder.render(horoscopelist[position], onItemSelected)
    }

}