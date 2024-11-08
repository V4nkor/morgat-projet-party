package com.projetparty.projetparty.repository;

import com.projetparty.projetparty.entity.Interest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface InterestRepository extends JpaRepository<Interest, Long> {
    @Query("SELECT i FROM Interest i WHERE i.id = :id")
    Optional<Interest> findById(@Param("id") Long id);

    Page<Interest> findAll(Pageable pageable);
}
