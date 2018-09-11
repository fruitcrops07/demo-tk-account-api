package gov.bfar.training.accountapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gov.bfar.training.accountapi.model.DailyTimeRecord;

@Repository
public interface DailyTimeRecordRepository extends JpaRepository<DailyTimeRecord, Long>{

}
