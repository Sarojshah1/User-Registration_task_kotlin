package com.example.user_registration.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.user_registration.R

class data_adapter(var nameList: ArrayList<String>, var imageList: ArrayList<Int>) : BaseAdapter() {


    override fun getCount(): Int {
        return nameList.size
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getItem(p0: Int): Any? {
        return null
    }

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        var view:View = LayoutInflater.from(parent!!.context).inflate(R.layout.sample_grid_view_1,parent,false)
        var name:TextView=view.findViewById(R.id.textViewgrid)
        var image:ImageView=view.findViewById(R.id.gridimageView)
        name.text=nameList[position]
        image.setImageResource(imageList[position])


        return  view

    }


}