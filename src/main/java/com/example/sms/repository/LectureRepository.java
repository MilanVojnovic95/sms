package com.example.sms.repository;

import com.example.sms.model.LectureEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LectureRepository  extends CrudRepository<LectureEntity, Integer> {

        @Query(value = "SELECT lecture.lectureName FROM LectureEntity lecture" +
                "           INNER JOIN StudentCourseEntity student_course on lecture.course.id = student_course.course_id" +
                "           INNER JOIN StudentEntity student on student.id = student_course.student_id" +
                "       WHERE student.id = :studentId")
        List<String> getLectureEntityByStudentId(Long studentId);

}