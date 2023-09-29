package com.prueba.demo.service;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import java.util.List;

import com.prueba.demo.model.Message;

public interface MessageService {

    Message sendMessage(Message message);
    List<Message> getMessagesByPost(Long postId, Long userId, Pageable pageable);
    
}
