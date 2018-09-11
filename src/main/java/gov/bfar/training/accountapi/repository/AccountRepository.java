package gov.bfar.training.accountapi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gov.bfar.training.accountapi.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

}
