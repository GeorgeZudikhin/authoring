package com.project.authoring.DAO;

import com.project.authoring.domain.Author;

import java.util.Optional;

public interface AuthorDAO {
    void create(Author author);

    Optional<Author> findOne(long authorId);
}
