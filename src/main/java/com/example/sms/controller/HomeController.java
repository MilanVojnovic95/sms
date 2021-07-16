package com.example.sms.controller;

import com.example.sms.model.CourseEntity;
import com.example.sms.model.LectureEntity;

import com.example.sms.model.StudentEntity;
import com.example.sms.service.HomeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class HomeController {

    private final HomeService homeService;



    @GetMapping("/lecture/{lectureId}/attending-students")
    public List<StudentEntity> getStudentsByLectureId(@PathVariable Long lectureId){
        return homeService.getStudentsByLectureId(lectureId);
    }

    @GetMapping("/student/{studentId}/attending-lectures")
    public List<LectureEntity> getLecturesByStudentId(@PathVariable Long studentId){
        return homeService.getLectureByStudentID(studentId);
    }


}


