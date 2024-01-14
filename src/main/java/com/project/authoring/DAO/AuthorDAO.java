package com.project.authoring.DAO;

import com.project.authoring.domain.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorDAO {
    void createAuthor(Author author);

    Optional<Author> findOneAuthor(long authorId);

    List<Author> findManyAuthors();

    void updateAuthor(long id, Author author);
}
