package com.neeraj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neeraj.entities.Loan_Item;

public interface LoanItemRepository extends JpaRepository<Loan_Item, Integer>  {


}

