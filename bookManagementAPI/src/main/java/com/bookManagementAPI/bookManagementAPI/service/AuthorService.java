package com.bookManagementAPI.bookManagementAPI.service;

import com.bookManagementAPI.bookManagementAPI.entity.Author;

import java.util.List;

public interface AuthorService {

        public List<Author> findAllAuthors();

        public Author findAuthorById(Long id);

        public void createAuthor(Author author);

        public void updateAuthor(Long id);

        public void deleteAuthor(Long id);
}
