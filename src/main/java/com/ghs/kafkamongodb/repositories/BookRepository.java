package com.ghs.kafkamongodb.repositories;


import com.ghs.kafkamongodb.entites.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface BookRepository extends MongoRepository<Book, String> {
    Optional<Book> findByIsbn(String isbn);
}
