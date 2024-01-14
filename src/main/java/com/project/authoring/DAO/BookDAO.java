package com.project.authoring.DAO;

import com.project.authoring.domain.Book;

import java.util.List;
import java.util.Optional;

public interface BookDAO {
    void createBook(Book book);

    Optional<Book> findOneBook(String isbn);

    List<Book> findManyBooks();

    void updateBook(String isbn, Book book);
}
