package com.nishajain.videomediaplayerkotlin

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView


class VideoAdapter(val requireContext: Context, val videoList: ArrayList<VideoModel>) :
    RecyclerView.Adapter<VideoAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title = itemView.findViewById<TextView>(R.id.tvTitle)
        val layout = itemView.findViewById<LinearLayout>(R.id.ll)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(requireContext).inflate(R.layout.recycler_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val video = videoList[position]
        val no = position+1
        holder.title.setText("Video " + no)
        holder.layout.setOnClickListener {
            val intent = Intent(requireContext, VideoActivity::class.java)
            intent.putExtra("videoUrl", video.videoUrl)
            requireContext.startActivity(intent)
        }
    }

    override fun getItemCount() = videoList.size
}

