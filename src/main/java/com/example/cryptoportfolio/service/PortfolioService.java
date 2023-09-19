package com.example.cryptoportfolio.service;

import com.example.cryptoportfolio.model.Portfolio;
import com.example.cryptoportfolio.model.User;

import java.util.List;

public interface PortfolioService {
    Portfolio create(Portfolio portfolio);
    Portfolio readById(long id);
    Portfolio update(Portfolio portfolio);
    void delete(long id);

    List<Portfolio> getPortfolios();
    List<Portfolio> getByUserId(long userId);
}
