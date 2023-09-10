package com.carlos.workshop.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {

    private String test;
    private Date date;
    private AuthorDTO author;

    public CommentDTO() {}

    public CommentDTO(String test, Date date, AuthorDTO author) {
        this.test = test;
        this.date = date;
        this.author = author;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }
}
