package com.example.sms.service;

import com.example.sms.model.StudentEntity;
import com.example.sms.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;


    public List<StudentEntity>getStudentEntityByLectureId(Long lectureId){


        List<StudentEntity> studentEntities = studentRepository.getStudentEntityByLectureId(lectureId);
        return studentEntities;
    }



}



