package com.example.book.service;

import com.example.book.entity.Book;

import java.util.List;

/**
 * @Author baoguangyu
 * @Date 2021/6/11 13:38
 * @Version 1.0
 */
public interface BookService {
    List<Book> findAll();
}
