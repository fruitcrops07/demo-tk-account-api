package gov.bfar.training.accountapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table
public class Employee extends AbstractEntity {

    /**
     * 
     */
    private static final long serialVersionUID = -3120101795401988043L;

    @Column(columnDefinition = "VARBINARY(16)")
    private String employeeNumber;

    @Column
    private String designation;
    @Column
    private String personalInformationId;

    public Employee() {
    }

    public Employee(String employeeNumber, String designation, String personalInformationId) {
        this.employeeNumber = employeeNumber;
        this.designation = designation;
        this.personalInformationId = personalInformationId;
    }

    public Long getId() {
        return this.id;
    }
}
