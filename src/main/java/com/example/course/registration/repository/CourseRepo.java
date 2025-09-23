package com.example.course.registration.repository;

import com.example.course.registration.model.course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<course, String> {
}
