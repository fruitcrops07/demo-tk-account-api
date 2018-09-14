package gov.bfar.training.accountapi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.bfar.training.accountapi.exception.EmployeeRecordExistException;
import gov.bfar.training.accountapi.logging.Operation;
import gov.bfar.training.accountapi.model.Employee;
import gov.bfar.training.accountapi.repository.EmployeeRepository;

import static gov.bfar.training.accountapi.logging.Operation.operation;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmployeeManagerService {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeManagerService.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createRecord(Employee employee) {
        final Operation operation = operation("createRecord").with("personalInformationId", employee.getPersonalInformationId()).started(logger);
        try {
            // check first if employee record exist using personalInformationId
            employeeRepository.findByPersonalInformationId(employee.getPersonalInformationId()) //
                              .ifPresent(presentRecord -> {
                                  throw new EmployeeRecordExistException(presentRecord.getPersonalInformationId());
                              });

            // create first employee record without employee number
            Employee record = employeeRepository.save(employee);
            record.setEmployeeNumber(generateEmployeeNumber(record.getId()));
            // update employee's employee number
            employeeRepository.save(record);
            operation.wasSuccessful();
            return record;
        } catch (EmployeeRecordExistException e) {
            operation.wasFailure();
            throw e;
        }
    }

    private String generateEmployeeNumber(Long lastInsertedId) {
        LocalDateTime date = LocalDateTime.now();
        String year = String.valueOf(date.getYear());
        String employeeNumberFormat = String.format("EMP-%s-%s", year, lastInsertedId);
        return employeeNumberFormat;
    }

    public Employee findEmployee(String employeeNumber) {
        final Operation operation = operation("findEmployee").with("employeeNumber", employeeNumber).started(logger);
        Employee employee = employeeRepository.findByEmployeeNumber(employeeNumber).orElseThrow(() -> new RuntimeException("no employee found"));
        operation.wasSuccessful();
        return employee;
    }

    public List<Employee> findAll() {
        final Operation operation = operation("findAll").started(logger);
        List<Employee> employees = employeeRepository.findAll();
        operation.wasSuccessful();
        return employees;
    }
}
