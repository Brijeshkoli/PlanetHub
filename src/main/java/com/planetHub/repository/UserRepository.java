package com.planetHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planetHub.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
