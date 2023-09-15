package org.priyanka.entities;
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

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int employee_id;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int item_id;

@Future(message="Return date should be in future")
private LocalDate return_date;

private LocalDate issue_date;
}