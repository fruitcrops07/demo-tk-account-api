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
public class Account extends AbstractEntity{

	/**
	 * Serial kuno
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(columnDefinition = "VARBINARY(16)")
    private UUID employeeNumber;

    @Column(length = 50)
    private String username;

    @Column(length = 128)
    private String password;
    
    @Column
    private String accountType;
    
    public Account() {
    }
}
