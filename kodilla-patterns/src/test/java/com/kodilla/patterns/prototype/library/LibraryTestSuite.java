package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("First Library");
        IntStream.iterate(1, n -> n + 1).limit(5).forEach(n -> library.getBooks().add(new Book("Title " + n, "Author" + n, LocalDate.now())));
        Book lastBook = new Book("kodilla", "Jesus", LocalDate.now());
        library.getBooks().add(lastBook);

        Library shallowCopiedLibrary = null;
        try {
            shallowCopiedLibrary = library.shallowCopy();
            shallowCopiedLibrary.setName("ShallowCopiedLibrary");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCopiedLibrary = null;
        try {
            deepCopiedLibrary = library.deepCopy();
            deepCopiedLibrary.setName("DeepCopiedLibrary");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().remove(lastBook);
        //Then
        System.out.println(library.getBooks());
        System.out.println(shallowCopiedLibrary.getBooks());
        System.out.println(deepCopiedLibrary.getBooks());
        Assert.assertEquals(5, library.getBooks().size());
        Assert.assertEquals(5, shallowCopiedLibrary.getBooks().size());
        Assert.assertEquals(6, deepCopiedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(), shallowCopiedLibrary.getBooks());
        Assert.assertNotEquals(deepCopiedLibrary.getBooks(), library.getBooks());
    }
}