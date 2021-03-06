package com.example.apiswapi.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;

import java.util.List;

@JsonAutoDetect
@Getter
public class AllFilmsResponse {
    private List<FilmResponse> results;
}
