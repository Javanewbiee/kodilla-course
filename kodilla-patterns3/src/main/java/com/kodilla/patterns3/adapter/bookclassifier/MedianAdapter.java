package com.kodilla.patterns3.adapter.bookclassifier;

import com.kodilla.patterns3.adapter.bookclassifier.librarya.Booka;
import com.kodilla.patterns3.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns3.adapter.bookclassifier.libraryb.BookSignature;
import com.kodilla.patterns3.adapter.bookclassifier.libraryb.Bookb;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicasionyearMedian(Set<Booka> bookSet) {
        Map<BookSignature, Bookb> books = new HashMap<>();
        for (Booka book : bookSet) {
            books.put(new BookSignature(book.getSignature()), new Bookb(book.getTitla(), book.getAuthor(), book.getPublicationYear()));
        }
        return medianPublicasionYear(books);
    }
}
