package com.ghs.kafkamongodb.repositories;


import com.ghs.kafkamongodb.entites.Author;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface AuthorRepository extends MongoRepository<Author, String> {
}
