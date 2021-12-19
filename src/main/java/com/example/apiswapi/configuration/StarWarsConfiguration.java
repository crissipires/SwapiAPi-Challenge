package com.example.apiswapi.configuration;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class StarWarsConfiguration {

    @Value("${starwars.base-url}")
    public String starWarsUrl;

    @Value("${starwars.films}")
    public String starWarsFilms;

    @Value("${starwars.people}")
    public String starWarsPeople;

    @Value("${starwars.planets}")
    public String starWarsPlanets;

    @Value("${starwars.starship}")
    public String starWarsStarship;
}
