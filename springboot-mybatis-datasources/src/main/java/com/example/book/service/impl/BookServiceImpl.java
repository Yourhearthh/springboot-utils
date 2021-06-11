package com.example.book.service.impl;

import com.example.book.entity.Book;
import com.example.book.mapper.BookMapper;
import com.example.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author baoguangyu
 * @Date 2021/6/11 13:38
 * @Version 1.0
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;


    @Override
    public List<Book> findAll() {
        return bookMapper.findAll();
    }
}
