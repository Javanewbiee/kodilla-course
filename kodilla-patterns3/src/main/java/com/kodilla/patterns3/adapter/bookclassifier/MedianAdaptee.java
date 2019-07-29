package com.kodilla.patterns3.adapter.bookclassifier;

import com.kodilla.patterns3.adapter.bookclassifier.libraryb.Bookb;
import com.kodilla.patterns3.adapter.bookclassifier.libraryb.BookSignature;
import com.kodilla.patterns3.adapter.bookclassifier.libraryb.BookStatistics;
import com.kodilla.patterns3.adapter.bookclassifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {

    @Override
    public int avaragePublicasionYear(Map<BookSignature, Bookb> books) {
        Statistics statistics = new Statistics();
        return statistics.avaragePublicasionYear(books);
    }

    @Override
    public int medianPublicasionYear(Map<BookSignature, Bookb> books) {
        Statistics statistics = new Statistics();
        return statistics.medianPublicasionYear(books);
    }
}
