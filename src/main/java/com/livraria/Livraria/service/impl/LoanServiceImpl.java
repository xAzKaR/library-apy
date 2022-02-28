package com.livraria.Livraria.service.impl;

import com.livraria.Livraria.model.entity.Loan;
import com.livraria.Livraria.model.repository.LoanRepository;
import com.livraria.Livraria.service.LoanService;

public class LoanServiceImpl implements LoanService {
    private LoanRepository repository;

    public LoanServiceImpl(LoanRepository repository) {
        this.repository = repository;
    }

    @Override
    public Loan save(Loan loan) {
        return repository.save(loan);
    }
}
