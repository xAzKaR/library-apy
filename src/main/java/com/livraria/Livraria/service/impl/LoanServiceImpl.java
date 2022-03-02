package com.livraria.Livraria.service.impl;

import com.livraria.Livraria.api.exceptions.BusinessException;
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
        if(repository.existsByBookAndNotReturned(loan.getBook())){
            throw new BusinessException("O livro já foi emprestado");
        }
        return repository.save(loan);
    }
}
