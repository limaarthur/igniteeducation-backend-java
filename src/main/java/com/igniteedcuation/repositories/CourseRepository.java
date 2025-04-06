package com.igniteedcuation.repositories;

import com.igniteedcuation.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
