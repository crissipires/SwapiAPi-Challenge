package com.example.apiswapi.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;
import lombok.Setter;

@JsonAutoDetect
@Getter
@Setter
public class PlanetResponse {
    private String name;
    private Double diameter;
    private Double area;

    public Double calculateArea(){
        double r = diameter / 2;
        return Math.PI * Math.pow(r,2);
    }
}
