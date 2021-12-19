package com.example.apiswapi.model;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;

@JsonAutoDetect
@Getter
public class PeopleResponse {
    private String name;
}
