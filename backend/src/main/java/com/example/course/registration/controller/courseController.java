package com.example.course.registration.controller;

import com.example.course.registration.model.CourseRegistry;
import com.example.course.registration.service.CourseService;
import com.example.course.registration.model.course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")

public class courseController {

    @Autowired
    CourseService courseService;
    @GetMapping("/courses")
    public List<course> availableCourses(){

        return courseService.availableCourses();
    }
    @GetMapping("courses/enrolled")
    public List<CourseRegistry> enrolledStudents(){

        return  courseService.enrolledStudents();
    }

    @PostMapping("/courses/register")

    public String enrollCourse(@RequestParam ("name") String name,@RequestParam("emailId") String emailId, @RequestParam("courseName") String courseName){
        courseService.enrollCourse(name,emailId,courseName);

         return "congratulation"+ name + "enrollmenyt successful for" +courseName;
    }
}
