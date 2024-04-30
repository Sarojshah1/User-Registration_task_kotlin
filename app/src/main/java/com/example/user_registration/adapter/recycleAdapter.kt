package com.example.user_registration.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.user_registration.R

class recycleAdapter(
    var title: ArrayList<String>,
    var imageList: ArrayList<Int>,
    var description: ArrayList<String>
) {
    class dataviewHolder(view: View):RecyclerView.ViewHolder(view){
        var title:  TextView=view.findViewById(R.id.textView5)
        var description:  TextView=view.findViewById(R.id.textView6)
        var images:  TextView=view.findViewById(R.id.imageView4)

    }


}