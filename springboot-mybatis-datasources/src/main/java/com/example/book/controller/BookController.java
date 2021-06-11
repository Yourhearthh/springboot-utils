package com.example.book.controller;

import com.example.book.entity.Book;
import com.example.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author baoguangyu
 * @Date 2021/6/11 13:39
 * @Version 1.0
 */
@RequestMapping("/book")
@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping("/findAll")
    public List<Book> findAll(){
        return bookService.findAll();
    }
}
