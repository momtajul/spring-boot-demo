package com.momtajul.spring.demo;

import com.momtajul.spring.demo.book.Book;
import com.momtajul.spring.demo.book.BookRepository;
import com.momtajul.spring.demo.customer.Customer;
import com.momtajul.spring.demo.customer.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

@Component
public class DataLoader implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(DataLoader.class);

    private final BookRepository bookRepository;
    private final CustomerRepository customerRepository;

    public DataLoader(BookRepository bookRepository, CustomerRepository customerRepository) {
        this.bookRepository = bookRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBooks();
        loadCustomers();
    }

    private void loadBooks(){
        Book b1 = new Book("Book A", BigDecimal.valueOf(9.99), LocalDate.of(2023, 8, 31));
        Book b2 = new Book("Book B", BigDecimal.valueOf(19.99), LocalDate.of(2023, 7, 31));
        Book b3 = new Book("Book C", BigDecimal.valueOf(29.99), LocalDate.of(2023, 6, 10));
        Book b4 = new Book("Book D", BigDecimal.valueOf(39.99), LocalDate.of(2023, 5, 5));

        // save a few books, ID auto increase, expect 1, 2, 3, 4
        bookRepository.save(b1);
        bookRepository.save(b2);
        bookRepository.save(b3);
        bookRepository.save(b4);

        // find all books
        log.info("findAll(), expect 4 books");
        log.info("-------------------------------");
        for (Book book : bookRepository.findAll()) {
            log.info(book.toString());
        }

        // find book by ID
        Optional<Book> optionalBook = bookRepository.findById(1L);
        optionalBook.ifPresent(obj -> {
            log.info("Book found with findById(1L):");
            log.info("--------------------------------");
            log.info(obj.toString());
        });

        // find book by title
        log.info("Book found with findByTitle('Book B')");
        log.info("--------------------------------------------");
        bookRepository.findByTitle("Book C").forEach(b -> {
            log.info(b.toString());
        });

        // find book by published date after
        log.info("Book found with findByPublishedDateAfter(), after 2023/7/1");
        log.info("--------------------------------------------");
        bookRepository.findByPublishedDateAfter(LocalDate.of(2023, 7, 1)).forEach(b -> {
            log.info(b.toString());
        });

        // delete a book
        bookRepository.deleteById(2L);
        log.info("Book delete where ID = 2L");
        log.info("--------------------------------------------");
        // find all books
        log.info("findAll() again, expect 3 books");
        log.info("-------------------------------");
        for (Book book : bookRepository.findAll()) {
            log.info(book.toString());
        }
    }

    private void loadCustomers(){
        Customer c1 = new Customer("Customer A", LocalDate.of(1980, 7, 1));
        Customer c2 = new Customer("Customer B", LocalDate.of(1990, 7, 1));
        Customer c3 = new Customer("Customer C", LocalDate.of(2001, 7, 1));
        Customer c4 = new Customer("Customer D", LocalDate.of(2004, 7, 1));

        // save a few books, ID auto increase, expect 1, 2, 3, 4
        customerRepository.save(c1);
        customerRepository.save(c2);
        customerRepository.save(c3);
        customerRepository.save(c4);
    }
}
