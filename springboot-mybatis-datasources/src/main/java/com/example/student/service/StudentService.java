package com.example.student.service;

import com.example.student.entity.Student;

import java.util.List;

/**
 * @Author baoguangyu
 * @Date 2021/6/11 13:36
 * @Version 1.0
 */
public interface StudentService {
    List<Student> findAll();
}
