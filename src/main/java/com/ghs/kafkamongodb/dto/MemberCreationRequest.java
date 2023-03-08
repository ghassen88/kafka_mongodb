package com.ghs.kafkamongodb.dto;


import com.ghs.kafkamongodb.entites.MemberStatus;
import lombok.Data;

@Data
public class MemberCreationRequest {

    private String id;
    private String firstName;
    private String lastName;
    private MemberStatus status;
}
