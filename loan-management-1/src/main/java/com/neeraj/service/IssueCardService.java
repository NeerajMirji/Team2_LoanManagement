package com.neeraj.service;

import java.util.List;


import com.neeraj.entities.Employee;

public interface IssueCardService {
	
	public IssueCard addIssueCard(IssueCard issuecard);
	public IssueCard getIssueCard(int id);
	public List<IssueCard> getAllIssueCards();
	public void remove_IssueCard(IssueCard issuecard);
}
