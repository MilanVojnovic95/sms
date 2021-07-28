package com.example.sms.repository;

import com.example.sms.model.StudentCourseEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;


public interface StudentCourseRepository extends CrudRepository<StudentCourseEntity, Integer> {



    @Query(value = "        SELECT AVG(studentCourse.grade) FROM StudentCourseEntity studentCourse " +
                   "        WHERE studentCourse.student_id = :studentId ")
    Long getStudentsAverageGrade(Long studentId);

    @Transactional
    @Modifying
    @Query("UPDATE StudentCourseEntity studentCourse SET studentCourse.grade = :grade" +
            " WHERE studentCourse.student_id = :studentId AND studentCourse.course_id = :courseId")
    void updateGrade (@Param(value = "studentId") Long studentId,
                   @Param(value = "courseId") Long courseID,
                   @Param(value = "grade")Integer grade);


    @Transactional
    @Modifying
    @Query(value = "INSERT INTO student_course  (student_id, course_id, grade )" +
            " VALUES (:studentId, :courseId, :grade)",
    nativeQuery = true)
    void addGrade (@Param("studentId") Long studentId,
                   @Param("courseId") Long courseId,
                   @Param("grade") Integer grade);





}
