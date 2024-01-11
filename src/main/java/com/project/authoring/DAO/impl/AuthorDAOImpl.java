package com.project.authoring.DAO.impl;

import com.project.authoring.DAO.AuthorDAO;
import org.springframework.jdbc.core.JdbcTemplate;

public class AuthorDAOImpl implements AuthorDAO {

    private final JdbcTemplate jdbcTemplate;

    public AuthorDAOImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
