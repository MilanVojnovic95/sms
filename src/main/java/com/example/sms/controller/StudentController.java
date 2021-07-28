package com.example.sms.controller;



import com.example.sms.model.StudentEntity;
import com.example.sms.service.LectureService;
import com.example.sms.service.StudentService;
import com.example.sms.service.StudentCourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class StudentController {



    private final StudentService studentService;
    private final LectureService lectureService;
    private final StudentCourseService studentCourseService;


    @GetMapping("/lecture/{lectureId}/attending-students")
    public List<StudentEntity> getStudentEntityByLectureId(@PathVariable Long lectureId){
        return studentService.getStudentEntityByLectureId(lectureId);
    }


    @GetMapping("/student/{studentId}/attending-lectures")
    public List<String>getLectureEntityByStudentId(@PathVariable Long studentId){
        return lectureService.getLectureEntityByStudentId(studentId);
    }

    @GetMapping("/student/{studentId}/average-grade")
    public Long getStudentsAverageGrade(@PathVariable Long studentId){
        return studentCourseService.getStudentsAverageGrade(studentId);
    }

    @PostMapping("/update/student/{studentId}/course/{courseId}")
    public String updateGrade (@PathVariable Long studentId,
                          @PathVariable  Long courseId,
                          @RequestBody Integer grade){


       return studentCourseService.updateGrade(studentId, courseId, grade);


    }

    @PostMapping("/student/{studentId}/course/{courseId}")
    public String addGrade (@PathVariable Long studentId,
                               @PathVariable  Long courseId,
                               @RequestBody Integer grade){


        return studentCourseService.addGrade(studentId, courseId, grade);


    }






}



