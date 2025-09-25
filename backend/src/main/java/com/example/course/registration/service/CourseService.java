package com.example.course.registration.service;

import com.example.course.registration.model.CourseRegistry;
import com.example.course.registration.model.course;
import com.example.course.registration.repository.CourseRegistryRepo;
import com.example.course.registration.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;
@Autowired
    CourseRegistryRepo courseRegistryRepo;
public List<course> availableCourses(){

    return  courseRepo.findAll();
}
public List<CourseRegistry> enrolledStudents(){
    return courseRegistryRepo.findAll();
}

    public void enrollCourse(String name, String emailId, String courseName) {

    CourseRegistry courseRegistry =new CourseRegistry(name,emailId,courseName);
    courseRegistryRepo.save(courseRegistry);
    }
}
