package com.bookManagementAPI.bookManagementAPI.controller;

import com.bookManagementAPI.bookManagementAPI.entity.Author;
import com.bookManagementAPI.bookManagementAPI.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {

    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    //http://localhost:8081/authors
    @GetMapping("/authors")
    public List<Author> findAllAuthors() {
        return authorService.findAllAuthors();
    }

    //http://localhost:8081/author/id=?
    @GetMapping("/author/{id}")
    public Author findAuthorById(@PathVariable("id") Long id) {
        return authorService.findAuthorById(id);
    }

    //http://localhost:8081/add-author
    @PostMapping("/add-author")
    public String createAuthor(Author author) {
        authorService.createAuthor(author);
        return "redirect:/authors";
    }

    //http://localhost:8081/update-author/id=?
    @PutMapping("/update-author/{id}")
    public String updateAuthor(@PathVariable("id") Long id) {
        authorService.updateAuthor(id);
        return "redirect:/authors";
    }

    //http://localhost:8081/remove-author/id=?
    @DeleteMapping("/remove-author/{id}")
    public String deleteAuthor(@PathVariable("id") Long id) {
        authorService.deleteAuthor(id);
        return "redirect:/authors";
    }
}

