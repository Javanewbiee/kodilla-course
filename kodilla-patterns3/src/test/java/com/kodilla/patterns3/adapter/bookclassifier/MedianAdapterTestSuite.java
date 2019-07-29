package com.kodilla.patterns3.adapter.bookclassifier;

import com.kodilla.patterns3.adapter.bookclassifier.librarya.Booka;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Booka book = new Booka("Ostatnie zyczenie","Sapkowski",1990,"S11");
        Booka book1 = new Booka("Miecz przeznaczenia","Sapkowski", 1991,"S12");
        Booka book2 = new Booka("Krew Elfóo","Sapkowski", 1993,"S13");
        Booka book3 = new Booka("Czas pogardy","Sapkowski", 1996,"S14");
        Booka book4 = new Booka("Pani Jeziora", "Sapkowski", 2000, "S15");
        Set<Booka> bookaSet = new HashSet<>();
        bookaSet.add(book);
        bookaSet.add(book1);
        bookaSet.add(book2);
        bookaSet.add(book3);
        bookaSet.add(book4);
        MedianAdapter adapter = new MedianAdapter();
        //When
        int result = adapter.publicasionyearMedian(bookaSet);
        //Then
        Assert.assertEquals(1993,result);
    }
}
