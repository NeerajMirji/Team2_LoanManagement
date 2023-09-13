package com.neeraj.entities;
import java.time.LocalDate;


import jakarta.validation.constraints.PastOrPresent;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="User_issue_details")
public class Issue_Card
{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int issue_id;


private int employee_id;


private int item_id;


private LocalDate return_date;

private LocalDate issue_date;

public int getIssue_id() {
	return issue_id;
}

public void setIssue_id(int issue_id) {
	this.issue_id = issue_id;
}

public int getEmployee_id() {
	return employee_id;
}

public void setEmployee_id(int employee_id) {
	this.employee_id = employee_id;
}

public int getItem_id() {
	return item_id;
}

public void setItem_id(int item_id) {
	this.item_id = item_id;
}

public LocalDate getReturn_date() {
	return return_date;
}

public void setReturn_date(LocalDate return_date) {
	this.return_date = return_date;
}

public LocalDate getIssue_date() {
	return issue_date;
}

public void setIssue_date(LocalDate issue_date) {
	this.issue_date = issue_date;
}
}