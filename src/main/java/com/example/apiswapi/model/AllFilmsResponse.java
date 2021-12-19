package com.example.apiswapi.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonAutoDetect
@Getter
public class AllFilmsResponse {
    private List<FilmsResponse> results;
}
