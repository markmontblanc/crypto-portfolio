package com.example.cryptoportfolio.repository;

import com.example.cryptoportfolio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
