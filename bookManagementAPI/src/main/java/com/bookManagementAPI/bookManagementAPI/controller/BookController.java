package com.bookManagementAPI.bookManagementAPI.controller;

import com.bookManagementAPI.bookManagementAPI.entity.Book;
import com.bookManagementAPI.bookManagementAPI.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    //http://localhost:8081/books
    @GetMapping("/books")
    public List<Book> findAllBooks() {
        return bookService.findAllBooks();
    }

    //http://localhost:8081/searchBook
    @GetMapping("/searchBook")
    public List<Book> searchBook(@RequestParam("keyword") String keyword) {
        return bookService.searchBooks(keyword);
    }


    //http://localhost:8081/book/id=1
    @GetMapping("/book/{id}")
    public Book findBookById(@PathVariable("id") Long id) {
        return bookService.findBookById(id);
    }


    //http://localhost:8081/add-book
    @PostMapping("/add-book")
    public String createBook(@RequestBody Book book) {
        bookService.createBook(book);
        return "redirect:/books";
    }


    //http://localhost:8081/update-book/id=1
    @PutMapping("/update-book/{id}")
    public String updateBook(@PathVariable("id") Long id, Book book) {
        bookService.updateBook(book);
        return "redirect:/books";
    }

    //http://localhost:8081/remove-book/id=1
    @DeleteMapping("/remove-book/{id}")
    public String deleteBook(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
        return "redirect:/books";
    }
}
