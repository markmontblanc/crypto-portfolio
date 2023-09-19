package com.example.cryptoportfolio.repository;

import com.example.cryptoportfolio.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {

    List<Portfolio> getByUserId(Long user_id);
}
