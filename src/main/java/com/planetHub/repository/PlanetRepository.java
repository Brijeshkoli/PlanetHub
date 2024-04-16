package com.planetHub.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planetHub.entity.Planet;

public interface PlanetRepository extends JpaRepository<Planet, Long> {

  // Query Method
  Optional<Planet> findByAuthor(String author);
}
