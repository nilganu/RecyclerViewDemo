package com.cahrusat.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arrStudent:ArrayList<Student> = ArrayList()
        arrStudent.add(Student("Nilay",1))
        arrStudent.add(Student("Rakesh",2))
        arrStudent.add(Student("Neel",3))
        arrStudent.add(Student("Rachana",4))
        arrStudent.add(Student("Hardik",5))
        arrStudent.add(Student("Hiyan",6))
        myrecyclerview.adapter=MyAdapter(arrStudent)
        myrecyclerview.
        addItemDecoration(DividerItemDecoration(applicationContext,DividerItemDecoration.VERTICAL))


    }
}