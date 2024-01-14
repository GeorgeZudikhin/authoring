package com.project.authoring;

import com.project.authoring.domain.Author;
import com.project.authoring.domain.Book;

public final class TestDataUtil {
    private TestDataUtil() {
    }

    public static Author createTestAuthorA() {
        return Author.builder()
                .id(1L)
                .name("Abigail Rose")
                .age(80)
                .build();
    }

    public static Author createTestAuthorB() {
        return Author.builder()
                .id(2L)
                .name("James McMillan")
                .age(45)
                .build();
    }

    public static Author createTestAuthorC() {
        return Author.builder()
                .id(3L)
                .name("Frederick Mueller")
                .age(59)
                .build();
    }


    public static Book createTestBookA() {
        return Book.builder()
                .isbn("978-1-2345-6789-8")
                .title("The Shadow in the Attic")
                .authorId(1L)
                .build();
    }

    public static Book createTestBookB() {
        return Book.builder()
                .isbn("123-5-4678-6009-3")
                .title("Unreasonable Hospitality")
                .authorId(1L)
                .build();
    }

    public static Book createTestBookC() {
        return Book.builder()
                .isbn("444-2-4563-1122-1")
                .title("The Art of War")
                .authorId(1L)
                .build();
    }
}
