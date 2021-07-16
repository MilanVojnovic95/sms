package com.example.sms.repository;

import com.example.sms.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {


    @Query(nativeQuery = true, value = "select * from student_entity" +
            "    inner join course_attend ca on student_entity.id = ca.student_id" +
            "    inner join lecture_entity le on ca.course_id = le.course_id" +
            "    where le.id = :lectureId")
    List<StudentEntity> getStudentEntityByLectureId(Long lectureId);

}


