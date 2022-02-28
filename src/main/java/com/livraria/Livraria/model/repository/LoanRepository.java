package com.livraria.Livraria.model.repository;

import com.livraria.Livraria.model.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
