package com.example.sms.controller;

import com.example.sms.model.CourseEntity;
import com.example.sms.model.LectureEntity;

import com.example.sms.model.UserEntity;
import com.example.sms.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;




    @GetMapping("/getAll")
    public List<UserEntity> getUsers(){
        return userService.loadUsers();
    }






    @GetMapping("/getAllLectures")
    public List<LectureEntity> getLectures(){ return userService.loadLectures();}





    @GetMapping("/getAllCourses")
    public List<CourseEntity> getCourses(){ return userService.loadCourses();}





    /**@RequestMapping(value = "/students/{id}")
    public Optional<StudentEntity> getStudentById(@PathVariable Long id) {
        return userService.getStudentById(id);
    }
    */



}


