package com.nuil.simplegithub.timeline

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.nuil.simplegithub.R
import kotlinx.android.synthetic.main.item_timeline.view.*

class TimeLineViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun setData(text: String) {
        itemView.imgProfile.setImageResource(R.drawable.ic_launcher_background)
        itemView.txtTitle.text = text
    }
}