package com.example.apiswapi.controller;

import com.example.apiswapi.model.AllPlanetsResponse;
import com.example.apiswapi.service.PlanetsService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PlanetsController {
    private PlanetsService planetsService;

    @GetMapping("/starwars/planets")
    public ResponseEntity<AllPlanetsResponse> getFilms() {
        return ResponseEntity.ok(planetsService.getPlanets());
    }
}
