
package com.hitms.lms;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private final List<String> books = new ArrayList<>();
	
public boolean containsBook(String title) {
    return books.contains(title);
}


    public void addBook(String title) {
        books.add(title);
    }

    public boolean issueBook(String title) {
        return books.remove(title);
    }

    public void returnBook(String title) {
        books.add(title);
    }

    public List<String> getBooks() {
        return new ArrayList<>(books);
    }
}
