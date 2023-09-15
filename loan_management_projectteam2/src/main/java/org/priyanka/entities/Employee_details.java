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
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Employees")

public class Employee_details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employee_id;
	
	@Size(min=8, message="Minimum password length is 8 characters")
	@Pattern(regexp="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^%$@#&!+=]).{8,}$",message="Password should have atleast 1 uppercase character, 1 lowercase character,1 digit and 1 special character(^%$@#&!+=)")
	@Column(nullable =false)
	private String employee_password;
	
	@Column(nullable =false)
	@Size(min=5,max=15,message="Username should be between 5 to 15 characters")
	private String employee_name;
	
	@Pattern(regexp = "(male|female|other)",message = "Gender should be male, female or other")
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
	
	@Pattern(regexp = "(user|admin)",message = "Role can be user or admin")
	private String roles;
	

}