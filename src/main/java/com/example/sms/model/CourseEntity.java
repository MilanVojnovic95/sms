package com.example.sms.model;


import lombok.*;

import javax.persistence.*;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@ToString

public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

   @OneToMany (mappedBy = "course")
   private List<LectureEntity> lectures;

    @ManyToMany(mappedBy = "attendedCourses")
    Set<StudentEntity> attends;

    public String CourseName;

    public long getId(){
        return id;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }



}