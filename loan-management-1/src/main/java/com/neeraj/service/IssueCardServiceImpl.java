package com.neeraj.service;

import com.neeraj.repositories.EmployeeRepository;
import com.neeraj.entities.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IssueCardServiceImpl implements IssueCardService{
	@Autowired
	private IssueCardRepository issuecardRepository;
	
	
	
	public IssueCardRepository getIssueCardRepository() {
		return issuecardRepository;
	}

	public void setIssueCard(IssueCardRepository issuecardRepository) {
		this.issuecardRepository = issuecardRepository;
	}

	@Override
	public IssueCard add(IssueCard issuecard) {
		return issuecardRepository.save(issuecard);
	}
	
	public IssueCard getIssueCardById(int id) {
		return issuecardRepository.findById(id).orElse(null);
	}
	public List<IssueCard> getAllIssueCard () {
		return issuecardRepository.findAll();
	}
	
	@Override
	public void remove_IssueCard(IssueCard to_be_deleted) {
		issuecardRepository.delete(to_be_deleted);
	}

}
