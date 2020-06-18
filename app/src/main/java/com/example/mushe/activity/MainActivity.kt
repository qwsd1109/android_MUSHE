package com.example.mushe.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mushe.R
import com.example.mushe.adapter.MainAdapter
import com.example.mushe.model.MainModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.mainRecyclerView)
        val dataList = ArrayList<MainModel>()
        dataList.add(MainModel("more and more", "트와이스","이승욱"))
        dataList.add(MainModel("봄나리", "펜타곤","qwsd1109  "))
        dataList.add(MainModel("봄날", "방탄소년단","cullisuu"))
        dataList.add(MainModel("봄바람", "워너원","ddangsu"))
//        pass the values to RvAdapter
        val rvAdapter = MainAdapter(dataList)
//        set the recyclerView to the adapter
        recyclerView.adapter = rvAdapter;
    }
}
