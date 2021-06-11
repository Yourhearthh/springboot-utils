package com.example.book.mapper;

import com.example.book.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author baoguangyu
 * @Date 2021/6/11 13:48
 * @Version 1.0
 */
@Mapper
public interface BookMapper {
    @Select("select * from book")
    List<Book> findAll();
}
