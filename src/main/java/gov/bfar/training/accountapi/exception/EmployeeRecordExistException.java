package gov.bfar.training.accountapi.exception;

public class EmployeeRecordExistException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = -4912767176688541558L;

    public EmployeeRecordExistException(String personalInformationId) {
        super("Employee with personalInformationId : " + personalInformationId + " already exist.");
    }

}
