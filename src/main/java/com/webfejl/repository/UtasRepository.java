package com.webfejl.repository;

import com.webfejl.model.Utas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtasRepository extends JpaRepository<Utas, Long> {
}