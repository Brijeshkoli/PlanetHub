package com.planetHub.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PlanetNotFoundException extends RuntimeException {
  private static final long serialVersionUID = 1L;
  private String message;

  public PlanetNotFoundException(String message) {
    this.message = message;
  }
}
