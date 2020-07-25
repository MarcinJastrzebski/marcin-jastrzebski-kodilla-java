package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdaptee;
import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;


public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        // Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("autor 1","tytul 1", 1992, "0001"));
        bookSet.add(new Book("autor 2","tytul 2", 1988, "0002"));
        bookSet.add(new Book("autor 3","tytul 3", 1978, "0003"));
        bookSet.add(new Book("autor 4","tytul 4", 1956, "0004"));
        bookSet.add(new Book("autor 5","tytul 5", 1944, "0005"));
        MedianAdapter medianAdapter = new MedianAdapter();

        // When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        System.out.println(median);
        assertEquals(1978,median,0);
    }

    @Test
    public void medianPublicationYearTest(){
        // Given
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
        books.put(new BookSignature("0001"), new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book("autor 1","tytul 1", 1992));
        books.put(new BookSignature("0002"), new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book("autor 2","tytul 2", 1988));
        books.put(new BookSignature("0003"), new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book("autor 3","tytul 3", 1978));
        books.put(new BookSignature("0004"), new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book("autor 4","tytul 4", 1956));
        books.put(new BookSignature("0005"), new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book("autor 5","tytul 5", 1944));
        MedianAdaptee medianAdaptee = new MedianAdaptee();

        // When
        int median = medianAdaptee.medianPublicationYear(books);
        //Then
        System.out.println(median);
        assertEquals(1978,median,0);
    }

    @Test
    public void medianPublicationYearStatisticsTest(){
        // Given
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
        books.put(new BookSignature("0001"), new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book("autor 1","tytul 1", 1992));
        books.put(new BookSignature("0002"), new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book("autor 2","tytul 2", 1988));
        books.put(new BookSignature("0003"), new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book("autor 3","tytul 3", 1978));
        books.put(new BookSignature("0004"), new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book("autor 4","tytul 4", 1956));
        books.put(new BookSignature("0005"), new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book("autor 5","tytul 5", 1944));
        Statistics statistics = new Statistics();

        // When
        int median = statistics.medianPublicationYear(books);
        //Then
        System.out.println(median);
        assertEquals(1978,median);
    }
}
