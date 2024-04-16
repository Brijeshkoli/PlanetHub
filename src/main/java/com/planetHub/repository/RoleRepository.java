package com.planetHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planetHub.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
