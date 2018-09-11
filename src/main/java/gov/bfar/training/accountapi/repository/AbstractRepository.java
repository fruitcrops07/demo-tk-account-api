package gov.bfar.training.accountapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gov.bfar.training.accountapi.model.AbstractEntity;

public interface AbstractRepository<T extends AbstractEntity> extends JpaRepository<Long, T> {

}
