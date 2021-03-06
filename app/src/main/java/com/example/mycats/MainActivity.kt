package com.example.mycats

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.customlistview.Fruit
import com.example.customlistview.MainRvAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mAdapter = MainRvAdapter(this, fruitList)
        mRecyclerView.adapter = mAdapter

        val lm = LinearLayoutManager(this)
        mRecyclerView.layoutManager = lm
        mRecyclerView.setHasFixedSize(true)
    }

    var fruitList = arrayListOf<Fruit>(
        Fruit("Fruit", "apple", "1", "fruit00"),
        Fruit("Fruit", "banana", "2", "fruit01"),
        Fruit("Fruit", "banana", "3", "fruit02"),
        Fruit("Fruit", "melon", "4", "fruit03"),
        Fruit("Fruit", "watermelon", "5", "fruit04"),
        Fruit("Fruit", "grape", "6", "fruit05")
    )
}
