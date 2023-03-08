package com.ghs.kafkamongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication

public class KafkaMongodbApplication   {




	public static void main(String[] args) {
		SpringApplication.run(KafkaMongodbApplication.class, args);

		System.out.println("Data creation started...");
		System.out.println("-------------CREATE GROCERY ITEMS-------------------------------\n");


	}

}

