package com.example.apiswapi.controller;

import com.example.apiswapi.model.PlanetResponse;
import com.example.apiswapi.service.PlanetsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/starwars")
@AllArgsConstructor
public class PlanetsController {

    private PlanetsService planetsService;

    @GetMapping("/planetsArea")
    public ModelAndView novo() {
        ModelAndView mv = new ModelAndView("planetsArea");
        List<PlanetResponse> planets = planetsService.getPlanets();
        mv.addObject("chartData",planets);
        return mv;
    }

}
