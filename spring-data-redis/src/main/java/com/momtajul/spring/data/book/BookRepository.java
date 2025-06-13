package com.momtajul.spring.data.book;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class BookRepository {

    private Map<Long, Book> books;

    public BookRepository() {
        loadBooks();
    }

    public List<Book> findAll(){
        return books.values().stream().toList();
    }

    public Optional<Book> findById(Long id){
        return Optional.of(books.get(id));
    }

    public Book save(Book book){
        books.put(book.getId(), book);
        return book;
    }

    public Book deleteById(Long id){
        Book book = books.get(id);
        books.remove(id);
        return book;
    }


    private void loadBooks() {
        books = new HashMap<>();
        Book b1 = new Book(1L, "Book A", BigDecimal.valueOf(9.99), LocalDate.of(2023, 8, 31));
        Book b2 = new Book(2L, "Book B", BigDecimal.valueOf(19.99), LocalDate.of(2023, 7, 31));
        Book b3 = new Book(3L, "Book C", BigDecimal.valueOf(29.99), LocalDate.of(2023, 6, 10));
        Book b4 = new Book(4L, "Book D", BigDecimal.valueOf(39.99), LocalDate.of(2023, 5, 5));

        books.put(b1.getId(), b1);
        books.put(b2.getId(), b2);
        books.put(b3.getId(), b3);
        books.put(b4.getId(), b4);
    }
}
