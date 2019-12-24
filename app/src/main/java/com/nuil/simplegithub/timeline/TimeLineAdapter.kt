package com.nuil.simplegithub.timeline

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nuil.simplegithub.R

class TimeLineAdapter : RecyclerView.Adapter<TimeLineViewHolder>() {
    private var timeLineList = arrayListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimeLineViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_timeline, parent, false)
        return TimeLineViewHolder(view)
    }

    override fun getItemCount(): Int {
        return timeLineList.size
    }

    override fun onBindViewHolder(holder: TimeLineViewHolder, position: Int) {
        holder.setData()
    }

}