package gov.bfar.training.accountapi.resource;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gov.bfar.training.accountapi.exception.EmployeeRecordExistException;
import gov.bfar.training.accountapi.model.Employee;
import gov.bfar.training.accountapi.service.EmployeeManagerService;

@Component
@Path("/employees")
public class EmployeeResource {

    @Autowired
    private EmployeeManagerService employeeManagerService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response employees() {
        return Response.ok() //
                       .entity(employeeManagerService.findAll())
                       .build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response createRecord(EmployeeRequest employeeRequest) {
        try {
            Employee employee = employeeManagerService.createRecord(new Employee(null, //
                                                                                 employeeRequest.getDesignation(),
                                                                                 employeeRequest.getPersonalInformationId()));
            return Response.ok()
                           .entity(new MessageResponse(HttpServletResponse.SC_CREATED, //
                                                       "employee record was created",
                                                       employee))
                           .build();
        } catch (EmployeeRecordExistException e) {
            return Response.status(HttpServletResponse.SC_BAD_REQUEST)
                           .entity(new MessageResponse(HttpServletResponse.SC_BAD_REQUEST, //
                                                       e.getMessage(),
                                                       null))
                           .build();
        }
    }
}
