package com.kodilla.patterns.singleton.prototype.library;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Book bookOne = new Book("Winds of War","Christine Golden", LocalDate.of(2009, Month.AUGUST,12));
        Book bookTwo = new Book("The Witcher", "Anrzej Sapkowski", LocalDate.of(1995,Month.FEBRUARY,15));
        Book bookThree = new Book("Illidan","William King", LocalDate.of(2012,Month.JUNE,22));
        Library library = new Library("Local Library");
        library.getBooks().add(bookOne);
        library.getBooks().add(bookTwo);
        library.getBooks().add(bookThree);
        //When
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
        }catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Local Library 2");
        }catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //Then
        System.out.println(clonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.getBooks());
        Assert.assertEquals(3,clonedLibrary.getBooks().size());
        Assert.assertEquals(3,deepClonedLibrary.getBooks().size());
    }
}
