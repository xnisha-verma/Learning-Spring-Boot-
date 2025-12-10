package com.taskTracker.quickstart.dao;

import com.taskTracker.quickstart.domain.Author;

import java.util.Optional;

public interface AuthorDao {

    void create(Author author);

    Optional<Author> findOne(long l);
}


