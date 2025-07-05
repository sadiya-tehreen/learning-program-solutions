// package com.library.service;

// import com.library.repository.BookRepository;

// public class BookService {
//     private BookRepository bookRepository;

//     // Setter for dependency injection
//     public void setBookRepository(BookRepository bookRepository) {
//         this.bookRepository = bookRepository;
//     }

//     public void addBook() {
//         System.out.println("Adding book via service...");
//         bookRepository.saveBook();
//     }
// }

package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter method for Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook() {
        System.out.println("Adding book via BookService...");
        bookRepository.saveBook();
    }
}
