package com.example.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mycats.R

class MainRvAdapter(val context: Context, val fruitList: ArrayList<Fruit>):
    RecyclerView.Adapter<MainRvAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {

        val view = LayoutInflater.from(context).inflate(R.layout.main_rv_item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {

        return fruitList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {

        holder?.bind(fruitList[position], context)
    }


    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {

        val fruitPhoto = itemView?.findViewById<ImageView>(R.id.mRecyclerView)
        val fruitFrist = itemView?.findViewById<TextView>(R.id.mRecyclerView)
        val fruitSecond = itemView?.findViewById<TextView>(R.id.mRecyclerView)
        val fruitThird = itemView?.findViewById<TextView>(R.id.mRecyclerView)

        fun bind (fruit: Fruit, context: Context) {

            if (fruit.photo != "") {
                val resourceId = context.resources.getIdentifier(fruit.photo, "drawable", context.packageName)
                fruitPhoto?.setImageResource(resourceId)
            } else {
                fruitPhoto?.setImageResource(R.mipmap.ic_launcher)
            }

            fruitFrist?.text = fruit.firstname
            fruitSecond?.text = fruit.secondname
            fruitThird?.text = fruit.codename
        }
    }
}