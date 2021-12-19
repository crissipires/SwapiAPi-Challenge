package com.example.apiswapi.service;

import com.example.apiswapi.components.StarWarsWebClient;
import com.example.apiswapi.model.AllPlanetsResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlanetsService {

    private final StarWarsWebClient starWarsWebClient;

    public AllPlanetsResponse getPlanets(){
        return starWarsWebClient.getPlanets();
    }
}
