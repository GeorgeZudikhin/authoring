package com.project.authoring.dao.impl;

import com.project.authoring.DAO.AuthorDAO;
import com.project.authoring.DAO.impl.BookDAOImpl;
import com.project.authoring.TestDataUtil;
import com.project.authoring.domain.Author;
import com.project.authoring.domain.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class BookDAOImplIntegrationTests {

    private AuthorDAO authorDao;
    private BookDAOImpl underTest;

    @Autowired
    public BookDAOImplIntegrationTests(BookDAOImpl underTest, AuthorDAO authorDAO) {
        this.underTest = underTest;
        this.authorDao = authorDAO;
    }

    @Test
    public void testingThatBookCanBeCreatedAndRecalled() {
        Author author = TestDataUtil.createTestAuthor();
        authorDao.create(author);
        Book book = TestDataUtil.createTestBook();
        book.setAuthorId(author.getId());
        underTest.create(book);
        Optional<Book> result = underTest.findOneBook(book.getIsbn());
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(book);
    }
}
