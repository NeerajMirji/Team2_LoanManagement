package com.neeraj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neeraj.entities.Loan_Item;
import com.neeraj.repositories.LoanItemRepository;

@Service
public  class LoanItemServiceImpl implements LoanItemService{
	@Autowired
	private LoanItemRepository loanItemRepository;
	
	
	
	public LoanItemRepository getLoanItemRepository() {
		return loanItemRepository;
	}

	public void setLoanItemRepository(LoanItemRepository loanItemRepository) {
		this.loanItemRepository = loanItemRepository;
	}


	@Override
	public Loan_Item addLoanItem(Loan_Item loan_item) {
		// TODO Auto-generated method stub
		return loanItemRepository.save(loan_item);
		 
	}

	@Override
	public Loan_Item getLoanItemById(int id) {
		// TODO Auto-generated method stub
		return loanItemRepository.findById(id).orElse(null);	
	}

	@Override
	public List<Loan_Item> getAllLoanItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLoanItem(Loan_Item loan_item) {
		// TODO Auto-generated method stub
		
	}

}