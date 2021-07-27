package com.example.sms.repository;

import com.example.sms.model.StudentCourseEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface StudentCourseRepository extends CrudRepository<StudentCourseEntity, Integer> {

    @Query(value = "        SELECT AVG(studentCourse.grade) FROM StudentCourseEntity studentCourse " +
                   "        WHERE studentCourse.student_id = :studentId ")
    Long getStudentsAverageGrade(Long studentId);




}
