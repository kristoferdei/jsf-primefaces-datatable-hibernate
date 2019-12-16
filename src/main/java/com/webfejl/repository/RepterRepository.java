package com.webfejl.repository;

import com.webfejl.model.Repter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepterRepository extends JpaRepository<Repter, Long> {
}