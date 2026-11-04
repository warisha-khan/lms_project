
package com.hitms.lms;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private final List<String> books = new ArrayList<>();
	
/**
 * Checks whether the library contains a book.
 */
public boolean containsBook(String title) {
    return books.contains(title);
}

/**
 * Adds a book to the library collection.
 */

    public void addBook(String title) {
        books.add(title);
    }

// Adds a new book to the catalogue.

    public boolean issueBook(String title) {
        return books.remove(title);
    }

// Adds a book title to the library collection.

    public void returnBook(String title) {
        books.add(title);
    }

    public List<String> getBooks() {
        return new ArrayList<>(books);
    }
}
