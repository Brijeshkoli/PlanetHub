package com.planetHub.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planetHub.entity.Planet;
import com.planetHub.repository.PlanetRepository;
import com.planetHub.service.framework.PlanetService;

@Service
public class PlanetServiceImpl implements PlanetService {
  private final PlanetRepository planetRepository;

  // @Autowired
  public PlanetServiceImpl(PlanetRepository planetRepository) {
    this.planetRepository = planetRepository;
  }

  @Override
  public List<Planet> getAllPlanets() {
    return planetRepository.findAll();
  }

  @Override
  public Optional<Planet> findById(Long id) {
    return planetRepository.findById(id);
  }

  @Override
  public Optional<Planet> findByAuthor(String author) {
    return planetRepository.findByAuthor(author);
  }

  @Override
  public Planet save(Planet std) {
    return planetRepository.save(std);
  }

  @Override
  public void deleteById(Long id) {
    planetRepository.deleteById(id);
  }

}
