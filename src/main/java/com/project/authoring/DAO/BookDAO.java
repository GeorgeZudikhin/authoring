package com.project.authoring.DAO;

import com.project.authoring.domain.Book;

import java.util.Optional;

public interface BookDAO {
    void create(Book book);

    Optional<Book> findOneBook(String isbn);
}
