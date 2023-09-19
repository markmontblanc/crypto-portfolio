package com.example.cryptoportfolio.service.impl;

import com.example.cryptoportfolio.model.Portfolio;
import com.example.cryptoportfolio.repository.PortfolioRepository;
import com.example.cryptoportfolio.repository.UserRepository;
import com.example.cryptoportfolio.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class PortfolioServiceImpl implements PortfolioService {
    @Autowired
    private PortfolioRepository portfolioRepository;

    @Autowired
    private UserRepository userRepository;


    @Override
    public Portfolio create(Portfolio portfolio) {
        return portfolioRepository.save(portfolio);
    }

    @Override
    public Portfolio readById(long id) {
        Optional<Portfolio> portfolio = portfolioRepository.findById(id);
    return portfolio.get();
    }

    @Override
    public Portfolio update(Portfolio portfolio) {
        return portfolioRepository.save(portfolio);
    }

    @Override
    public void delete(long id) {
        portfolioRepository.deleteById(id);
    }

    @Override
    public List<Portfolio> getPortfolios() {
        List<Portfolio> portfolios = portfolioRepository.findAll();
        return portfolios.isEmpty() ? new ArrayList<>() : portfolios;
    }

    @Override
    public List<Portfolio> getByUserId(long user_id) {
        List<Portfolio> portfolios = portfolioRepository.getByUserId(user_id);
        return portfolios.isEmpty() ? new ArrayList<>() : portfolios;
    }
}
