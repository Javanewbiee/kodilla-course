package com.kodilla.patterns3.adapter.bookclassifier.libraryb;

import java.util.Map;

public interface BookStatistics {

    int avaragePublicasionYear(Map<BookSignature, Bookb>books);
    int medianPublicasionYear(Map<BookSignature, Bookb>books);
}
