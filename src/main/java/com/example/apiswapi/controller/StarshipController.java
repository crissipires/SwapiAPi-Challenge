package com.example.apiswapi.controller;

import com.example.apiswapi.service.StarshipService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/starwars")
@AllArgsConstructor
public class StarshipController {

    private StarshipService starshipService;

    @GetMapping("/pilotsmf")
    public ModelAndView novo() {
        ModelAndView mv = new ModelAndView("mfpilots");
        List<String> pilotsFromStarship = starshipService.getPilotsFromStarship();
        mv.addObject("chartData", pilotsFromStarship);
        return mv;
    }
}

