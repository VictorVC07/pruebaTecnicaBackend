package com.prueba.demo.repository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.demo.model.Message;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByPostIdAndSenderUserIdOrderByTimestampDesc(Long postId, Long senderUserId, Pageable pageable);
}