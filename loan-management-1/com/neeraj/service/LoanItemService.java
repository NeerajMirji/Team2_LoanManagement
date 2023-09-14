package com.neeraj.service;

import java.util.List;

import com.neeraj.entities.Loan_Item;

public interface LoanItemService {
	
	public Loan_Item addLoanItem(Loan_Item loan_item);
	public Loan_Item getLoanItemById(int id);
	public List<Loan_Item> getAllLoanItems();
	public void removeLoanItem(Loan_Item loan_item);
}
