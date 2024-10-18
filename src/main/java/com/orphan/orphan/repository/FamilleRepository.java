package com.orphan.orphan.repository;

import com.orphan.orphan.model.Famille;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilleRepository extends JpaRepository<Famille, Integer> {
}
