package com.nishajain.videomediaplayerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rv: RecyclerView
    lateinit var adapter: VideoAdapter
    var list = ArrayList<VideoModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv = findViewById(R.id.rv)
        rv.layoutManager = LinearLayoutManager(this)
        loadVideos()
    }

    fun loadVideos() {
        list.clear()
        list.add(VideoModel("http://techslides.com/demos/sample-videos/small.mp4"))
        list.add(VideoModel("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4"))
        list.add(VideoModel("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4"))
        list.add(VideoModel("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"))
        list.add(VideoModel("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/Sintel.mp4"))

        adapter = VideoAdapter(this, list)
        rv.adapter = adapter

    }

}