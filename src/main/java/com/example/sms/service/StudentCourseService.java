package com.example.sms.service;


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


    public String updateGrade (Long studentId, Long courseId, Integer grade) {
        studentCourseRepository.updateGrade(studentId, courseId, grade);
        return "Grade has been updated!";
    }

    public String addGrade (Long studentId, Long courseId, Integer grade) {
        studentCourseRepository.addGrade(studentId, courseId, grade);
        return "Grade has been added!";
    }

}
