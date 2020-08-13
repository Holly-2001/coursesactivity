package com.example.hello_h

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_course_activityh.*
import layout.coursesrecyclerviewadapter as coursesrecyclerviewadapter1

data class Coursesactivity(val courses_id:Int, val courses_name:String, val course_code:Int, val instructor:String, val Description:String)
class coursesactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_activityh)
        rvcourse.layoutManager = LinearLayoutManager(baseContext)
        val CoursesAdapter = CoursesRecyclerViewAdapter(
            listOf(

                Coursesactivity(5006, "Kotlin", 4014, "Holly", "Kotlin project1"),
                Coursesactivity(5007, "Kotlin", 4024, "Atieno", "Kotlin project1"),
                Coursesactivity(5008, "Kotlin", 4034, "Ouma", "Kotlin project1"),
                Coursesactivity(5009, "Kotlin", 4044, "Peninah", "Kotlin project1"),
                Coursesactivity(5000, "Kotlin", 4054, "Njeri", "Kotlin project1"),
                Coursesactivity(5001, "Kotlin", 4064, "Kahuria", "Kotlin project1"),
                Coursesactivity(5002, "Kotlin", 4074, "Rose", "Kotlin project1"),
                Coursesactivity(5003, "Kotlin", 40084, "Achieng", "Kotlin project1"),
                Coursesactivity(5004, "Kotlin", 40894, "Fiddy", "Kotlin project1"),
                Coursesactivity(5005, "Kotlin", 40674, "Brenda", "Kotlin project1")

            )
        )

    }
}




