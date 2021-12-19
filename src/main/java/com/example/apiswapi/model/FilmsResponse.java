package com.example.apiswapi.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonAutoDetect
@Getter
@Setter
public class FilmsResponse {

    private String title;
    private List<String> characters;
}
