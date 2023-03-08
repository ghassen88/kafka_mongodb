package com.ghs.kafkamongodb.repositories;


import com.ghs.kafkamongodb.entites.Book;
import com.ghs.kafkamongodb.entites.Lend;
import com.ghs.kafkamongodb.entites.LendStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface LendRepository extends MongoRepository<Lend, String> {
    Optional<Lend> findByBookAndStatus(Book book, LendStatus status);
}