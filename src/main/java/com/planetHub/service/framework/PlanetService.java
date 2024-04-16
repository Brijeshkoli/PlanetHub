package com.planetHub.service.framework;

import java.util.List;
import java.util.Optional;

import com.planetHub.entity.Planet;

public interface PlanetService {
  List<Planet> getAllPlanets();

  Optional<Planet> findById(Long id);

  Optional<Planet> findByAuthor(String author);

  Planet save(Planet std);

  void deleteById(Long id);
}
