package com.prueba.demo.service.impl;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.demo.model.Message;
import com.prueba.demo.model.Post;
import com.prueba.demo.repository.MessageRepository;
import com.prueba.demo.repository.PostRepository;
import com.prueba.demo.service.MessageService;

import java.util.List;

import javax.persistence.EntityNotFoundException;

@Service
public class MessageServiceImpl implements MessageService {
    private final MessageRepository messageRepository;
    
    @Autowired
    private PostRepository postRepository;

    @Autowired
    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public Message sendMessage(Message message) {
        // Lógica para enviar un mensaje y guardarlo en la base de datos
    	Long postId = message.getPost().getId();
    	 // Buscar el Post en la base de datos
    	
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new EntityNotFoundException("No se encontró el Post con ID: " + postId));

        // Asignar el Post al mensaje
        message.setPost(post);
        return messageRepository.save(message);
    }

    @Override
    public List<Message> getMessagesByPost(Long postId, Long userId, Pageable pageable) {
    	
        return messageRepository.findByPostIdAndSenderUserIdOrderByTimestampDesc(postId, userId, pageable);
    }
}