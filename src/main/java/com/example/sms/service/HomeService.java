package com.example.sms.service;

import com.example.sms.model.CourseEntity;
import com.example.sms.model.LectureEntity;
import com.example.sms.model.StudentEntity;
import com.example.sms.repository.CourseRepository;
import com.example.sms.repository.LectureRepository;
import com.example.sms.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class HomeService {


    private final StudentRepository studentRepository;

    private final LectureRepository lectureRepository;







    public List<StudentEntity> getStudentsByLectureId(Long lectureId){
        return studentRepository.getStudentEntityByLectureId(lectureId);
    }


    public List<LectureEntity> getLectureByStudentID(Long studentId){



        List<LectureEntity> lectureEntities = lectureRepository.getLectureEntityByStudentId(studentId);
        return lectureEntities;
     }



}


