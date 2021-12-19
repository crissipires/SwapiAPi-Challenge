package com.example.apiswapi.service;

import com.example.apiswapi.components.StarWarsWebClient;
import com.example.apiswapi.model.PeopleResponse;
import com.example.apiswapi.model.StarshipResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StarshipService {

    private StarWarsWebClient starWarsWebClient;

    public List<String> getPilotsFromStarship(){
        StarshipResponse starship = starWarsWebClient.getStarship(10);
        List<String> allPilots = new ArrayList<>();

        for (String pilot : starship.getPilots()) {
            Integer idByUrl = getIdByUrl(pilot);
            PeopleResponse people = starWarsWebClient.getPeople(idByUrl);
            allPilots.add(people.getName());
        }

        return allPilots;
    }

    private Integer getIdByUrl(String url){
        String substring = url.substring(20);
        String s = substring.replaceAll("[\\D]", "");
        return Integer.parseInt(s);
    }
}
