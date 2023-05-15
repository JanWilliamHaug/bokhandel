package com.example.bokhandel.service;

import com.example.bokhandel.service.*;
import org.springframework.stereotype.Service;
import com.example.bokhandel.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private List<Book> books = new ArrayList<>();

    public List<Book> getAllBooks() {
        return books;
    }

    public Optional<Book> getBook(Long id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst();
    }

    public void addBook(Book book) {
        books.add(book);
    }
}
