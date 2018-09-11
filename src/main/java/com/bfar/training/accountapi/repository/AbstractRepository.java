package com.bfar.training.accountapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bfar.training.accountapi.model.AbstractEntity;

public interface AbstractRepository<T extends AbstractEntity> extends JpaRepository<Long, T> {

}
