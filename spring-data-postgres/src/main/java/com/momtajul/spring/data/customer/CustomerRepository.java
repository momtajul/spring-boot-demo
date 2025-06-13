package com.momtajul.spring.data.customer;

import com.momtajul.spring.data.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface CustomerRepository  extends JpaRepository<Customer, Long> {

    List<Book> findByName(String name);

    @Query("SELECT c FROM Customer c WHERE c.birthDate > :date")
    List<Customer> findByBirthDateAfter(@Param("date") LocalDate date);
}
