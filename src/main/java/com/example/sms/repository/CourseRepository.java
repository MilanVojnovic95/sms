package com.example.sms.repository;

import com.example.sms.model.CourseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface CourseRepository  extends CrudRepository<CourseEntity, Integer> {



}