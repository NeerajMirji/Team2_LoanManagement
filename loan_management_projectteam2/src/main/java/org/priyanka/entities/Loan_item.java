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
import jakarta.validation.constraints.NotBlank;
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

@Table(name="Loan_item")
public class Loan_item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employee_id;
	
	@NotBlank(message="Item category is required")
	@Size(min=1,max=25,message="Item category length should be between 1 and 25 characters")
	private String item_category;

	@NotBlank(message="Item description is required")
	@Size(min=1,max=25,message="Item description length should be between 1 and 50 characters")
	private String item_description;
	
	@NotBlank(message="Item value is required")
	private double item_value;
	
	@Pattern(regexp = "(pending|approved|rejected)",message = "Status can only be pending, approved or rejected")
	private String item_status="pending";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loan_id;
	
	@Column(nullable =false)
	private String loan_type;
	
	@Min(value = 1,message = "Loan duration should be greater than 1")
	private int duration_item;
	
	@PastOrPresent(message="Apply date should be in past or present")
	private LocalDate apply_date;
	
	


}
