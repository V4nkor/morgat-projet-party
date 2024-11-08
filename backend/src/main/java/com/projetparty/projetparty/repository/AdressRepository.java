package com.projetparty.projetparty.repository;

import com.projetparty.projetparty.entity.Adress;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface AdressRepository extends JpaRepository<Adress, Long> {
    @Query("SELECT a FROM Adress a WHERE a.id = :id")
    Optional<Adress> findById(@Param("id") Long id);

    Page<Adress> findAll(Pageable pageable);
}
