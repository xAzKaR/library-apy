package com.livraria.Livraria.api.resource;

import com.livraria.Livraria.api.dto.BookDTO;
import com.livraria.Livraria.model.entity.Book;
import com.livraria.Livraria.service.BookService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookDTO create(@RequestBody BookDTO dto) {
        Book bookCriar = Book.builder()
                .author(dto.getAuthor())
                .title(dto.getTitle())
                .isbn(dto.getIsbn()).build();

        bookCriar = service.save(bookCriar);

        return BookDTO.builder()
                .id(bookCriar.getId())
                .author(bookCriar.getAuthor())
                .title(bookCriar.getTitle())
                .isbn(bookCriar.getIsbn()).build();
    }
}
