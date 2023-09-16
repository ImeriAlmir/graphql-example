package com.devalmir.graphqlexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devalmir.graphqlexample.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}
