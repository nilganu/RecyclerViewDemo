package com.cahrusat.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycleitem.view.*

class MyAdapter(var arrStudent:ArrayList<Student>)
    :RecyclerView.Adapter<MyAdapter.ViewHolder> (){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
    : ViewHolder {
        var layoutInflater=LayoutInflater.from(parent.context)
        var view=layoutInflater.inflate(R.layout.recycleitem,
            parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder
                (holder: ViewHolder, position:Int) {
        holder.bind(arrStudent[position])
    }

    override fun getItemCount(): Int {
        return arrStudent.size
    }

    class ViewHolder(var viewItem:View):
        RecyclerView.ViewHolder(viewItem)
    {
        fun bind(student:Student)
        {
            viewItem.txtStudentName.text=student.name
            viewItem.txtRollNo.text=student.id.toString()
        }

    }

}