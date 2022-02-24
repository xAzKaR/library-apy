package com.livraria.Livraria.service;

import com.livraria.Livraria.model.entity.Book;

import java.util.Optional;


public interface BookService {
    Book save(Book any);

    Optional<Book> getById(Long id);
}
