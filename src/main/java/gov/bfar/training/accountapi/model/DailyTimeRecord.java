package gov.bfar.training.accountapi.model;

import java.sql.Date;
import java.sql.Time;
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
public class DailyTimeRecord extends AbstractEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(columnDefinition = "VARBINARY(16)")
	private UUID employeeNumber;
	
	@Column
	private Time timeInAM;
	@Column
	private Time timeoutAM;
	@Column
	private Time timeInPM;
	@Column
	private Time timeoutPM;
	@Column
	private Date workDate;

	public DailyTimeRecord() {
	}
}
