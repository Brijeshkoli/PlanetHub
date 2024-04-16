package com.planetHub.controller;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.planetHub.entity.Planet;
import com.planetHub.exception.PlanetNotFoundException;
import com.planetHub.service.framework.PlanetService;
@RestController
@RequestMapping("/api/planet")
public class PlanetController {
    private final PlanetService planetService;
    
 
  public PlanetController(PlanetService planetService) {
    this.planetService = planetService;
  }

  @GetMapping
  public List<Planet> getAllPlanets() {
    return planetService.getAllPlanets();
  }

  @GetMapping(value = "/{id}")
  public Planet getPlanetById(@PathVariable("id") @Min(1) Long id) {
    Planet std = planetService.findById(id)
        .orElseThrow(() -> new PlanetNotFoundException("Planet with " + id + " is not found!"));

    return std;
  }

  @PostMapping
  public Planet addPlanet(@Valid @RequestBody Planet std) {
    return planetService.save(std);
  }

  @PutMapping(value = "/{id}")
  public Planet updatePlanet(@PathVariable("id") @Min(1) Long id, @Valid @RequestBody Planet newStd) {

    Planet student = planetService.findById(id)
        .orElseThrow(() -> new PlanetNotFoundException("Planet with " + id + " is not found!"));

    student.setTitle(newStd.getTitle());
    student.setDescription(newStd.getDescription());

    return planetService.save(student);
  }

  @DeleteMapping(value = "/{id}")

  public String deletePlanet(@PathVariable("id") @Min(1) Long id) {
    Planet std = planetService.findById(id)
        .orElseThrow(() -> new PlanetNotFoundException("Planet with " + id + " is not found!"));
    planetService.deleteById(std.getId());

    return "Planet with ID " + id + " is deleted";
  }
}





