package com.taskTracker.quickstart.dao.impl;


import com.taskTracker.quickstart.domain.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class BookDaoImp {
    @Mock
    private JdbcTemplate jdbcTemplate;
    @InjectMocks
    private BookDaoImpl UnderTest;
    @Test
    public void testBookCorrectSql(){
        Book book = Book.builder()
                .isbn("883-2883-22")
                .title("Can we be Strangers again")
                .author_id(1L)
                .build();
        UnderTest.create(book);
        verify(jdbcTemplate).update(
                eq("INSERT INTO books(isbn, title, author_id) VALUES (?,?,?)"),
                eq("883-2883-22"),
                eq("Can we be Strangers again"),
                eq(1L)

        );

    }


}
