package com.example.apiswapi.configuration;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class StarWarsConfiguration {

    @Value("${starwars.base-url}")
    public String starWarsUrl;

    @Value("${starwars.peoples}")
    public String starWarsPeoples;

    @Value("${starwars.films}")
    public String starWarsFilms;
}
