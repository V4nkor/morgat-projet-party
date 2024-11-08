package com.projetparty.projetparty.repository;

import com.projetparty.projetparty.entity.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface MessageRepository extends JpaRepository<Message, Long> {
    @Query("SELECT m FROM Message m WHERE m.id = :id")
    Optional<Message> findById(@Param("id") Long id);
    Page<Message> findAll(Pageable pageable);

    @Query("SELECT m FROM Message m WHERE m.sender.id = :senderId")
    Page<Message> findBySenderId(@Param("senderId") Long senderId, Pageable pageable);

    @Query("SELECT m FROM Message m WHERE m.recipient.id = :recipientId")
    Page<Message> findByRecipientId(@Param("recipientId") Long recipientId, Pageable pageable);
}
