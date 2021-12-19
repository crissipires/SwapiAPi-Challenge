package com.example.apiswapi.service;

import com.example.apiswapi.components.StarWarsWebClient;
import com.example.apiswapi.model.AllPlanetsResponse;
import com.example.apiswapi.model.PlanetResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
@AllArgsConstructor
public class PlanetsService {

    private final StarWarsWebClient starWarsWebClient;

    public List<PlanetResponse> getPlanets(){
        AllPlanetsResponse planets = starWarsWebClient.getPlanets();
        for (PlanetResponse planet : planets.getResults()) {
            planet.setArea(planet.calculateArea());
        }

        List<PlanetResponse> results = planets.getResults();
        results.sort(Comparator.comparing(PlanetResponse::getArea));

        return results;
    }

}
