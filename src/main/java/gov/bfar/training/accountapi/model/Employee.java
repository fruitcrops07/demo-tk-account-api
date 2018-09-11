package gov.bfar.training.accountapi.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table
public class Employee extends AbstractEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(columnDefinition = "VARBINARY(16)")
	private UUID employeeNumber;
	
	@Column
	private String designation;
	@Column
	private String personalInformationId ;

	public Employee() {
	}
}
