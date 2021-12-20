package com.example.apiswapi.controller;

import com.example.apiswapi.service.FilmsService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/starwars")
@AllArgsConstructor
public class FilmsController {

    private final FilmsService filmsService;

    @GetMapping("/characters/appearmost")
    public ModelAndView novo() {
        ModelAndView mv = new ModelAndView("appearmost");
        Map<String, Integer> charactersAppearMost = filmsService.getCharactersAppearMost();
        mv.addObject("chartData",charactersAppearMost);
        return mv;
    }
}
