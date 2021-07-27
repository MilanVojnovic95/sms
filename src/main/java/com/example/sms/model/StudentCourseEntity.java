package com.example.sms.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Student_course")
@IdClass(StudentCourseEntity.StudentCourseKey.class)
public class StudentCourseEntity {

    @Id
    private Long student_id;
    @Id
    private Long course_id;
    private Integer grade;


    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class StudentCourseKey implements Serializable {
        protected Long student_id;
        protected Long course_id;
    }
}
