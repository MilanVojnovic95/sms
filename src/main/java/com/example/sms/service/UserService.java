package com.example.sms.service;

import com.example.sms.model.CourseEntity;
import com.example.sms.model.LectureEntity;
import com.example.sms.model.StudentEntity;
import com.example.sms.model.UserEntity;
import com.example.sms.repository.CourseRepository;
import com.example.sms.repository.LectureRepository;
import com.example.sms.repository.StudentRepository;
import com.example.sms.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final StudentRepository studentRepository;

    private final LectureRepository lectureRepository;

    private final CourseRepository courseRepository;



    public List<UserEntity> loadUsers(){

        List<StudentEntity> students = studentRepository.findAll();

        for(StudentEntity student: students){
            System.out.println(student.toString());
        }

       return userRepository.findAll();
    }



    public List<LectureEntity> loadLectures() {


        List<LectureEntity> lectures = lectureRepository.findAll();

        for (LectureEntity lecture: lectures) {
            System.out.println(lecture.toString());
        }
        return lectureRepository.findAll();
    }




    public List<CourseEntity> loadCourses() {


        List<CourseEntity> courses = courseRepository.findAll();

        for (CourseEntity course: courses) {
            System.out.println(course.toString());
        }
        return courseRepository.findAll();


    }


   /** public Optional<StudentEntity> getStudentById(Long id) {

        return studentRepository.findById(id);
    }
    */
}
