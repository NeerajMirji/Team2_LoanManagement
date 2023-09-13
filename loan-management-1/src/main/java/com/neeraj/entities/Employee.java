package com.neeraj.entities;


import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Employees")

public class Employee{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employee_id;
	

	
//	@Pattern(regexp="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^%$@#&!+=]).{8,}$",message="Password should have atleast 1 uppercase character, 1 lowercase character,1 digit and 1 special character(^%$@#&!+=)")
	@Column(nullable =false)
	private String employee_password;
	
	@Column(nullable =false)
	private String employee_name;
	
	@Pattern(regexp = "(Male|Female|Other)",message = "Gender should be male, female or other")
	private String gender;
	
	@Max(value = 60,message = "Age Should be between 18 and 60")
	@Min(value = 18,message = "Age Should be between 18 and 60")
	private int age;
	
	@Column(nullable = false)
	private double salary;
	
	@Email(message = "Invalid Email Id")
	private String email;
	
	@PastOrPresent(message="Date of joining should be in past or present")
	private LocalDate doj;
	
	@Pattern(regexp = "[9876][0-9]{9}",message = "Mobile number is invalid")
	private String mobile;
	
	
	private String roles = "user";
	
	
	public int getId() {
		return employee_id;
	}
	public void setId(int id) {
		this.employee_id = id;
	}
	public String getName() {
		return employee_name;
	}
	public void setName(String name) {
		this.employee_name= name ;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	

}