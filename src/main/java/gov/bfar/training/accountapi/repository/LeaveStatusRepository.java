package gov.bfar.training.accountapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import gov.bfar.training.accountapi.model.LeaveStatus;

@Repository
public interface LeaveStatusRepository extends JpaRepository<LeaveStatus, Long>{

}
