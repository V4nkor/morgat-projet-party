package com.projetparty.projetparty.repository;

import com.projetparty.projetparty.entity.Game;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface GameRepository extends JpaRepository<Game, Long> {
    @Query("SELECT g FROM Game g WHERE g.id = :id")
    Optional<Game> findById(@Param("id") Long id);

    Page<Game> findAll(Pageable pageable);
}
