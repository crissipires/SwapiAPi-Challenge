package com.example.apiswapi.controller;

import com.example.apiswapi.service.StarshipService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class StarshipController {

    private StarshipService starshipService;

    @GetMapping("/starwars/pilotsMF")
    public ResponseEntity<List<String>> getFilms() {
        return ResponseEntity.ok(starshipService.getPilotsFromStarship());
    }
}

