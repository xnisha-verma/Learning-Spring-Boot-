package com.taskTracker.quickstart.dao.impl;

import com.taskTracker.quickstart.dao.AuthorDao;
import com.taskTracker.quickstart.domain.Author;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.swing.tree.RowMapper;
import java.util.Optional;

public class AuthorDaoImpl implements AuthorDao {
    private final JdbcTemplate jdbcTemplate;

    public AuthorDaoImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;

    }

    @Override
    public void create(Author author) {
        jdbcTemplate.update("INSERT INTO author (id,name,age) VALUES(?,?,?)",
                author.getId(), author.getName(), author.getAge()
                );
    }

    @Override
    public Optional<Author> findOne(long l) {
        return Optional.empty();
    }
    public static class AuthorRowMapper implements RowMapper<Author>{
        public
    }
}
