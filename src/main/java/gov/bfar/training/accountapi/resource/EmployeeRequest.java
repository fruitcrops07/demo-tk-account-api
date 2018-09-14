package gov.bfar.training.accountapi.resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeRequest {

    private String designation;
    private String personalInformationId;

    public EmployeeRequest() {
    }

    public EmployeeRequest(String designation, String personalInformationId) {
        this.designation = designation;
        this.personalInformationId = personalInformationId;
    }

}
