package com.example.user_registration

import android.os.Bundle
import android.widget.GridView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.user_registration.adapter.data_adapter

class gridviewActivity : AppCompatActivity() {
    lateinit var gridview: GridView
    var nameList=ArrayList<String>()
    var imageList=ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_gridview)
        gridview=findViewById(R.id.gridview)
        nameList.add("screenshot 1")
        nameList.add("screenshot 2")
        nameList.add("screenshot 3")
        nameList.add("screenshot 4")
        nameList.add("screenshot 5")
        nameList.add("screenshot 6")
        nameList.add("screenshot 7")
        nameList.add("screenshot 8")
        nameList.add("screenshot 9")
        nameList.add("screenshot 10")


        imageList.add(R.drawable.a)
        imageList.add(R.drawable.b)
        imageList.add(R.drawable.ba)
        imageList.add(R.drawable.c)
        imageList.add(R.drawable.d)
        imageList.add(R.drawable.e)
        imageList.add(R.drawable.f)
        imageList.add(R.drawable.g)
        imageList.add(R.drawable.h)
        imageList.add(R.drawable.i)

        var adapter=data_adapter(nameList,imageList)
        gridview.adapter=adapter
        gridview.setOnItemClickListener { adapterView, view, i, l ->Toast.makeText(applicationContext,nameList[i],Toast.LENGTH_LONG).show()  }




    }

}