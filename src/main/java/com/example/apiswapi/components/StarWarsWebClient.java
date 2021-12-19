package com.example.apiswapi.components;

import com.example.apiswapi.configuration.StarWarsConfiguration;
import com.example.apiswapi.model.AllFilmsResponse;
import com.example.apiswapi.model.FilmsResponse;
import com.example.apiswapi.model.PeopleResponse;
import lombok.Getter;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
@Getter
public class StarWarsWebClient {

    private final String allFilmsResource;
    private final String peopleResource;
    public WebClient webClient;

    public StarWarsWebClient(WebClient webClient, StarWarsConfiguration starWarsConfiguration) {
        this.webClient = webClient;
        this.peopleResource = starWarsConfiguration.starWarsPeople;
        this.allFilmsResource = starWarsConfiguration.starWarsFilms;
    }

    public AllFilmsResponse getAllfilms(){
        return webClient
                .method(HttpMethod.GET)
                .uri(allFilmsResource)
                .retrieve()
                .bodyToMono(AllFilmsResponse.class)
                .block();
    }

    public PeopleResponse getPeople(Integer id){
        return webClient
                .method(HttpMethod.GET)
                .uri(peopleResource, id)
                .retrieve()
                .bodyToMono(PeopleResponse.class)
                .block();
    }
}
