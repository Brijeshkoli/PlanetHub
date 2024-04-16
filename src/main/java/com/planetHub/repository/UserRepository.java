package com.planetHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planetHub.entity.User;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-reset-password
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/04/22
 * Time: 08.38
 */
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
