package gov.bfar.training.accountapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gov.bfar.training.accountapi.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findByEmployeeNumber(String employeeNumber);

    Optional<Employee> findByPersonalInformationId(String personalInformationId);
}
