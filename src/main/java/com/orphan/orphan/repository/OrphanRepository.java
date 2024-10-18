package com.orphan.orphan.repository;

import com.orphan.orphan.model.OrphanEntity;
import com.orphan.orphan.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrphanRepository extends JpaRepository<OrphanEntity, Long> {
}