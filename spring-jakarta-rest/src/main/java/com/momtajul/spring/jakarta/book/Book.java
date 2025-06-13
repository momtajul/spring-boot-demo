package com.momtajul.spring.jakarta.book;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Book {

    private Long id;
    private String title;
    private BigDecimal price;
    private LocalDate publishDate;

    // for JPA only, no use
    public Book() {
    }

    public Book(Long id, String title, BigDecimal price, LocalDate publishDate) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.publishDate = publishDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }
}
