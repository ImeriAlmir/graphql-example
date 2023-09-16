package com.devalmir.graphqlexample.inputs;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookInput {
    public String title;
    public String author;
}
