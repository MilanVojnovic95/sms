package com.example.sms.repository;

import com.example.sms.model.StudentEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {

    @Query(value = "SELECT student FROM StudentEntity student" +
            "           INNER JOIN StudentCourseEntity student_course on student_course.student_id = student.id" +
            "           INNER JOIN LectureEntity lecture on lecture.course.id = student_course.course_id" +
            "       WHERE lecture.id = :lectureId")
    List<StudentEntity> getStudentEntityByLectureId(Long lectureId);

}
