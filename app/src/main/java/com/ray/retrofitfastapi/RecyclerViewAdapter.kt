package com.ray.retrofitfastapi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row_list.view.*

class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    var userList = mutableListOf<User>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row_list, parent, false)
        return MyViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(userList[position])
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        val textViewName = view.textViewName
        val textViewEmail = view.textViewEmail
        val textViewStats = view.textViewStats


        fun bind(data: User) {
            textViewName.text = data.name
            textViewEmail.text = data.email
            textViewStats.text = data.status
        }
    }

}