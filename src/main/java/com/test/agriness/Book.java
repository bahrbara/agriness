package com.test.agriness;

import javax.persistence.Entity;

@Entity
public class Book {

    private int id;
    private String title;
    private BookStatus status;

    public Book(int id, String title, BookStatus status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }
}
