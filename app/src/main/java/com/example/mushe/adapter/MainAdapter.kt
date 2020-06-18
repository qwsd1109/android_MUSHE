package com.example.mushe.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mushe.R
import com.example.mushe.model.MainModel

class MainAdapter(val musicList: ArrayList<MainModel>):
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(p0?.context).inflate(R.layout.item_main, p0, false)
        return ViewHolder(v)
    }
    override fun getItemCount(): Int {
        return musicList.size
    }
    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

        p0.maintitle?.text = musicList[p1].itemMusicTitle
        p0.muicesinger?.text = musicList[p1].itemMusicSinger
        p0.muiceadd?.text = musicList[p1].itemMusic
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val maintitle = itemView.findViewById<TextView>(R.id.item_music_title)
        val muicesinger = itemView.findViewById<TextView>(R.id.item_music_singer)
        val muiceadd = itemView.findViewById<TextView>(R.id.item_music)

    }
}