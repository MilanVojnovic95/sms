package com.example.sms.service;


import com.example.sms.repository.LectureRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LectureService {
    private final LectureRepository lectureRepository;

    public List<String>getLectureEntityByStudentId(Long studentId){

        List<String> lectureEntities = lectureRepository.getLectureEntityByStudentId(studentId);
        return lectureEntities;
    }

}



