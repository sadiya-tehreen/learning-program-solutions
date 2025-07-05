// package com.library;

// import org.springframework.context.ApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;

// import com.library.service.BookService;

// public class MainApp {
//     public static void main(String[] args) {
//         ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//         BookService bookService = (BookService) context.getBean("bookService");
//         bookService.addBook();
//     }
// }

package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class MainApp {
    public static void main(String[] args) {
        // Load Spring configuration from applicationContext.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Use the service
        bookService.addBook();
    }
}
