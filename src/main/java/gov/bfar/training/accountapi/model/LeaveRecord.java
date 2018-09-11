package gov.bfar.training.accountapi.model;

import java.sql.Date;
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
public class LeaveRecord extends AbstractEntity{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(columnDefinition = "VARBINARY(16)")
	private UUID employeeNumber;
	
	@Column
	private String leaveType;
	
	@Column
	private Date leaveStartDate;
	
	@Column
	private Date leaveEndDate;

	public LeaveRecord() {
	}

}
