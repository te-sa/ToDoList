package com.example.todolist;

import com.google.gson.annotations.SerializedName;

public class Quote {
    private String quote;
    @SerializedName("person")
    private String author;

    public String getQuote() {
        return quote;
    }

    public String getAuthor() {
        return author;
    }
}
