package com.projetparty.projetparty.repository;

import com.projetparty.projetparty.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.id = :id")
    Optional<User> findById(@Param("id") Long id);

    @Query("SELECT u FROM User u WHERE u.email = :email")
    Optional<User> findByEmail(@Param("email") String email);

    @Query("SELECT DISTINCT us FROM User us " +
            "LEFT JOIN FETCH us.interests i " +
            "LEFT JOIN FETCH us.adress a " +
            "LEFT JOIN FETCH us.ratings r " +
            "LEFT JOIN FETCH us.receivedMessages rm " +
            "LEFT JOIN FETCH us.sentMessages sm "
    )
    Page<User> findAll(Pageable pageable);
}
