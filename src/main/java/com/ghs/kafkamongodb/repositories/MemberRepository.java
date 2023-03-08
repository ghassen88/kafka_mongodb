package com.ghs.kafkamongodb.repositories;


import com.ghs.kafkamongodb.entites.Member;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemberRepository extends MongoRepository<Member, String> {
}
