package com.itheima.controller;


import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

//@RestController
@RequestMapping("/books")
public class BookController2 {
    @Autowired
    private BookService bookService;
    @Resource
    private BookDao bookDao;

    @GetMapping()
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @PostMapping("save")
    public Boolean save(@RequestBody Book book){
        System.out.println(book);
        return bookService.save(book);
    }

    @PutMapping
    public Boolean update(Book book){
        return bookService.update(book);
    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return bookService.delete(id);
    }
    @GetMapping("{id}")
    public Book getById(@PathVariable Integer id){
        return bookService.getById(id);
    }
}
