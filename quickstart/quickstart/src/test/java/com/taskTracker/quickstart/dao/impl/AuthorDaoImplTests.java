package com.taskTracker.quickstart.dao.impl;

import com.taskTracker.quickstart.domain.Author;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.swing.tree.RowMapper;

import static org.hamcrest.Matchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class AuthorDaoImplTests {
    @Mock
    private JdbcTemplate jdbcTemplate;
    @InjectMocks
    private AuthorDaoImpl underTest;
    @Test
    public void testCorrectSql(){
        Author author = Author.builder()
                .id(1L)
                .name("nisha")
                .age(20)
                .build();
        underTest.create(author);
        verify(jdbcTemplate).update(
                eq("INSERT INTO author (id,name,age) VALUE(?,?,?)"),
                eq(1L),
                eq("nisha"),
                eq(20)
        );
    }
    @Test
    public void testthatFindOneGeneratesCorrectSql(){
        underTest.findOne(1L);
        verify(jdbcTemplate).query(
                "SELECT id, name, age FROM auhtors WHERE id=? LIMIT 1", any(RowMapper.class) , eq(1L)
        );
    }
}