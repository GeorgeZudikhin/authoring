package com.project.authoring.dao.impl;

import com.project.authoring.DAO.impl.AuthorDAOImpl;
import com.project.authoring.TestDataUtil;
import com.project.authoring.domain.Author;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class AuthorDAOImplIntegrationTests {

    private AuthorDAOImpl underTest;

    @Autowired
    public AuthorDAOImplIntegrationTests(AuthorDAOImpl underTest) {
        this.underTest = underTest;
    }

    @Test
    public void testThatAuthorCanBeCreatedAndRecalled() {
        Author author = TestDataUtil.createTestAuthorA();
        underTest.createAuthor(author);
        Optional<Author> result = underTest.findOneAuthor(author.getId());
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(author);
    }

    @Test
    public void testThatMultipleAuthorsCanBeCreatedAndRecalled() {
        Author authorA = TestDataUtil.createTestAuthorA();
        underTest.createAuthor(authorA);
        Author authorB = TestDataUtil.createTestAuthorB();
        underTest.createAuthor(authorB);
        Author authorC = TestDataUtil.createTestAuthorC();
        underTest.createAuthor(authorC);

        List<Author> result = underTest.findManyAuthors();
        assertThat(result)
                .hasSize(3)
                .containsExactly(authorA, authorB, authorC);
    }
}
