package com.livraria.Livraria.model.repository;

import com.livraria.Livraria.model.entity.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@DataJpaTest
public class BookRepositoryTest {

    @Autowired
    TestEntityManager testEntityManager;

    @Autowired
    BookRepository repository;

    @Test
    @DisplayName("Deve retornar verdadeiro quando existir um livro na base com o isbn informado")
    public void returnTrueWhenIsbnExists() {
//        Cenário

        String isbn = "123";

        Book book = Book.builder().title("Aventuras").author("Fulano").isbn("123").build();

        testEntityManager.persist(book);

//        Execução

        boolean exists = repository.existsByIsbn(isbn);

//        Verificação

        assertThat(exists).isTrue();

    }

    @Test
    @DisplayName("Deve retornar Falso quando existir um livro na base com o isbn informado")
    public void returnFalseWhenIsbnExists() {
//        Cenário

        String isbn = "123";

//        Execução

        boolean exists = repository.existsByIsbn(isbn);

//        Verificação

        assertThat(exists).isFalse();

    }
}
