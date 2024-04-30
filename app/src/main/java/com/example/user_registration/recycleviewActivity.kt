package com.example.user_registration

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class recycleviewActivity : AppCompatActivity() {
    lateinit var recycleview:RecyclerView
    var title=ArrayList<String>()
    var imageList=ArrayList<Int>()
    var description=ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycleview)
        recycleview=findViewById(R.id.recycleview)

        title.add("screenshot 1")
        title.add("screenshot 2")
        title.add("screenshot 3")
        title.add("screenshot 4")
        title.add("screenshot 5")
        title.add("screenshot 6")
        title.add("screenshot 7")
        title.add("screenshot 8")
        title.add("screenshot 9")
        title.add("screenshot 10")

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

        description.add("this is screenshot 1")
        description.add("this is screenshot 2")
        description.add("this is screenshot 3")
        description.add("this is screenshot 4")
        description.add("this is screenshot 5")
        description.add("this is screenshot 6")
        description.add("this is screenshot 7")
        description.add("this is screenshot 8")
        description.add("this is screenshot 9")
        description.add("this is screenshot 10")

    }
}