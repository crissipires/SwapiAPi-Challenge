package com.example.apiswapi.components;

import com.example.apiswapi.configuration.StarWarsConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class StarWarsWebClient {

    private final String allPeopleResource;
    private final String allFilmsResource;
    private WebClient webClient;

    public StarWarsWebClient(WebClient webClient, StarWarsConfiguration starWarsConfiguration) {
        this.webClient = webClient;
        this.allPeopleResource = starWarsConfiguration.starWarsPeoples;
        this.allFilmsResource = starWarsConfiguration.starWarsFilms;
    }

    public AllFilmsResponse getAllfilms(){
        return webClient
                .get()
                .uri(allFilmsResource)
                .retrieve()
                .bodyToMono(AllFilmsResponse.class)
                .block();
    }

}
