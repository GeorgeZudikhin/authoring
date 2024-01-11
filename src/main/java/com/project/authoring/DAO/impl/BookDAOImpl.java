package com.project.authoring.DAO.impl;

import com.project.authoring.DAO.BookDAO;
import org.springframework.jdbc.core.JdbcTemplate;

public class BookDAOImpl implements BookDAO {

    private final JdbcTemplate jdbcTemplate;

    public BookDAOImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
