package com.example.hello_h

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import kotlinx.android.synthetic.main.activity_main.*




class CoursesRecyclerViewAdapter(val coursesList: List<Courses>
) :
    RecyclerView.Adapter<CoursesRecyclerViewAdapter.NamesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_courses_item, parent, false)
        return NamesViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return coursesList.size
    }


    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.rowView.rvCourses.text = coursesList[position].toString()
    }

    class NamesViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)
}






