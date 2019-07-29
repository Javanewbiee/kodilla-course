package com.kodilla.patterns3.adapter.bookclassifier.librarya;

public class Booka {

    private final String titla;
    private final String author;
    private final int publicationYear;
    private final String signature;

    public Booka(String titla, String author, int publicationYear, String signature) {
        this.titla = titla;
        this.author = author;
        this.publicationYear = publicationYear;
        this.signature = signature;
    }

    public String getTitla() {
        return titla;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getSignature() {
        return signature;
    }
}
