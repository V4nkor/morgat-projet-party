package com.projetparty.projetparty.repository;

import com.projetparty.projetparty.entity.Rating;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    @Query("SELECT r FROM Rating r WHERE r.id = :id")
    Optional<Rating> findById(@Param("id") Long id);

    Page<Rating> findAll(Pageable pageable);

    @Query("SELECT r FROM Rating r WHERE r.user.id = :userId")
    Page<RatingRepository> findAllForUser(@Param("userId") Long userId, Pageable pageable);


}
