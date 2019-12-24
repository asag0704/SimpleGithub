package com.nuil.simplegithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nuil.simplegithub.timeline.TimeLineAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var timeLineAdapter: TimeLineAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initTimeLine()
    }

    private fun initTimeLine() {
        timeLineAdapter = TimeLineAdapter()

        rvTimeLine.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvTimeLine.setHasFixedSize(true)
        rvTimeLine.adapter = timeLineAdapter

        for (i in 0..50) {
            timeLineAdapter.addItem("title $i")
        }
        timeLineAdapter.notifyDataSetChanged()
    }
}
