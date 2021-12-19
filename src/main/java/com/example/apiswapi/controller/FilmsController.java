package com.example.apiswapi.controller;

import com.example.apiswapi.model.AllFilmsResponse;
import com.example.apiswapi.service.FilmsService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
public class FilmsController {
    private final FilmsService filmsService;

    @GetMapping("/starwars/films")
    public ResponseEntity<AllFilmsResponse> getFilms() {
        return ResponseEntity.ok(filmsService.getFilms());
    }

    @GetMapping("/starwars/characters/appearmost")
    public ResponseEntity<Map<String, Integer>> getFilm() {
        return ResponseEntity.ok(filmsService.getCharactersAppearMost());
    }
}
