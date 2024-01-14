package com.project.authoring;

import com.project.authoring.domain.Author;
import com.project.authoring.domain.Book;

public final class TestDataUtil {
    private TestDataUtil() {
    }

    public static Author createTestAuthor() {
        return Author.builder()
                .id(1L)
                .name("Abigail Rose")
                .age(80)
                .build();
    }

    public static Book createTestBook() {
        return Book.builder()
                .isbn("978-1-2345-6789-8")
                .title("The Shadow in the Attic")
                .authorId(1L)
                .build();
    }
}
