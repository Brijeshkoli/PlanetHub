package com.planetHub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.planetHub.entity.Planet;
import com.planetHub.service.framework.PlanetService;

// import lombok.AllArgsConstructor;

@Controller
// @AllArgsConstructor
public class PlanetWebController {
  private PlanetService planetService;

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("planet", planetService.getAllPlanets());
    return "index";
  }

  @GetMapping("/create")
  public String create(Model model) {
    model.addAttribute("planet", new Planet());
    return "planet";
  }

  @PostMapping("/create")
  public String addPlanet(Model model, Planet planet) {
    model.addAttribute("planet", planetService.save(planet));
    return "redirect:/";
  }

  @GetMapping("/detail/{id}")
  public String detail(@PathVariable Long id, Model model) {
    planetService.findById(id).ifPresent(planet -> model.addAttribute("planet", planet));
    return "planetdetails";
  }

  @GetMapping("/edit/{id}")
  public String index(@PathVariable Long id, Model model) {
    model.addAttribute("planet", planetService.findById(id));
    return "planet";
  }

  @GetMapping("/delete/{id}")
  public String index(@PathVariable Long id) {
    planetService.deleteById(id);
    return "redirect:/";
  }
}
