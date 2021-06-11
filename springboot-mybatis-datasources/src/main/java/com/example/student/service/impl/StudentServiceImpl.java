package com.example.student.service.impl;

import com.example.student.entity.Student;
import com.example.student.mapper.StudentMapper;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author baoguangyu
 * @Date 2021/6/11 13:37
 * @Version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }
}
