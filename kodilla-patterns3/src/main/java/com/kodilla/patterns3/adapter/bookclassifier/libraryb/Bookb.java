package com.kodilla.patterns3.adapter.bookclassifier.libraryb;

public class Bookb {
    private final String titla;
    private final String author;
    private final int yearOfPublicashion;

    public Bookb(String titla, String author, int yearOfPublicashion) {
        this.titla = titla;
        this.author = author;
        this.yearOfPublicashion = yearOfPublicashion;
    }

    public String getTitla() {
        return titla;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublicashion() {
        return yearOfPublicashion;
    }
}
