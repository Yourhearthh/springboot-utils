package com.example.student.mapper;

import com.example.student.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author baoguangyu
 * @Date 2021/6/11 13:48
 * @Version 1.0
 */
@Mapper
public interface StudentMapper {
    @Select("select * from student")
    List<Student> findAll();
}
