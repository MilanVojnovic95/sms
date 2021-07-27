package com.example.sms.service;

import com.example.sms.model.LectureEntity;
import com.example.sms.repository.LectureRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LectureService {
    private final LectureRepository lectureRepository;

    public List<LectureEntity>getLectureEntityByStudentId(Long studentId){

        List<LectureEntity> lectureEntities = lectureRepository.getLectureEntityByStudentId(studentId);
        return lectureEntities;
    }

}



