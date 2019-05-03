package com.kodilla.good.patterns.challenges;

public class Book implements Item {

    private String author;
    private String title;
    private String itemType = "Book";

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }


    public String getItemType() {
        return itemType;
    }

    @Override
    public String toString() {
        return author + title;
    }
}
