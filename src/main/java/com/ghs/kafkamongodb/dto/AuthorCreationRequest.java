package com.ghs.kafkamongodb.dto;


import lombok.Data;

@Data
public class AuthorCreationRequest {
    private String firstName;
    private String lastName;
}
