package com.example.sms.service;

import com.example.sms.model.StudentCourseEntity;
import com.example.sms.repository.StudentCourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@AllArgsConstructor
public class StudentCourseService {

    private final StudentCourseRepository studentCourseRepository;



    public Long getStudentsAverageGrade(Long studentId){


        Long studentCourseEntities = studentCourseRepository.getStudentsAverageGrade(studentId);
        return studentCourseEntities;
    }

}
