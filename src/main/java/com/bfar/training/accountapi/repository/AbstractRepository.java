package com.bfar.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bfar.training.model.AbstractEntity;

public interface AbstractRepository<T extends AbstractEntity> extends JpaRepository<Long, T> {

}
