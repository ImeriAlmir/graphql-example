package com.devalmir.graphqlexample.controller;

import com.devalmir.graphqlexample.entity.Book;
import com.devalmir.graphqlexample.inputs.BookInput;
import com.devalmir.graphqlexample.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class GraphQLController {
    @Autowired
    private BookRepository bookRepository;

    @QueryMapping
    Iterable<Book> books() {
        return bookRepository.findAll();
    }

    @MutationMapping
    Book createBook(@Argument BookInput bookInput) {
        log.info(String.valueOf(bookInput));
        Book book = Book.builder()
                .title(bookInput.getTitle())
                .author(bookInput.getAuthor())
                .build();
        return bookRepository.save(book);
    }
}
