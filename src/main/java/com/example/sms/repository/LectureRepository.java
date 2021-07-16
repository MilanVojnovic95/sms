package com.example.sms.repository;

import com.example.sms.model.LectureEntity;
import com.example.sms.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LectureRepository extends JpaRepository<LectureEntity, Long> {


    @Query(nativeQuery = true, value = "select * from lecture_entity\n" +
            "inner join course_entity ce on ce.id = lecture_entity.course_id\n" +
            "inner join course_attend ca on ce.id = ca.course_id\n" +
            "where ca.student_id = :studentId")
    List<LectureEntity> getLectureEntityByStudentId(Long studentId);

}

