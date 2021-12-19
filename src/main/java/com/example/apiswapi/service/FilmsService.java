package com.example.apiswapi.service;

import com.example.apiswapi.components.StarWarsWebClient;
import com.example.apiswapi.model.AllFilmsResponse;
import com.example.apiswapi.model.FilmResponse;
import com.example.apiswapi.model.PeopleResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FilmsService {
    private final StarWarsWebClient starWarsWebClient;

    public AllFilmsResponse getFilms() {
        return starWarsWebClient.getAllfilms();
    }

    public Map<String, Integer> getCharactersAppearMost(){
        Map<String,Integer> mostAppear = new HashMap<>();

        for (String charactersByFilm : getCharactersByFilms()) {
            mostAppear.compute(charactersByFilm, (k,v) -> v == null ? 1 : v + 1);
        }

        return mostAppear.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    private List<String> getCharactersByFilms(){
        AllFilmsResponse allfilms = starWarsWebClient.getAllfilms();
        List<String> allCharacter = new ArrayList<>();

        for (FilmResponse result : allfilms.getResults()) {
            for (String character : result.getCharacters()) {
                Integer idByUrl = getIdByUrl(character);
                PeopleResponse people = starWarsWebClient.getPeople(idByUrl);
                allCharacter.add(people.getName());
            }
        }
        return allCharacter;
    }

    private Integer getIdByUrl(String url){
        String substring = url.substring(20);
        String s = substring.replaceAll("[\\D]", "");
        return Integer.parseInt(s);
    }
}
