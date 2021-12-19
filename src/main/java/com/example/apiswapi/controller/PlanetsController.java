package com.example.apiswapi.controller;

import com.example.apiswapi.model.PlanetResponse;
import com.example.apiswapi.service.PlanetsService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlanetsController {
    private PlanetsService planetsService;

    @GetMapping("/starwars/planets")
    public ResponseEntity<List<PlanetResponse>> getFilms() {
        return ResponseEntity.ok(planetsService.getPlanets());
    }

}
