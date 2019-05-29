package com.example.mvvmarctecturalpattern.repository

import androidx.lifecycle.LiveData
import com.example.mvvmarctecturalpattern.data.Course
import com.example.mvvmarctecturalpattern.data.CourseDao

class CourseRepository(private val courseDao: CourseDao) {

    fun allCourses(): LiveData<List<Course>> = courseDao.getAllCourses()

    fun insertCourse(course: Course) {
        courseDao.insertCourse(course)
    }
}


