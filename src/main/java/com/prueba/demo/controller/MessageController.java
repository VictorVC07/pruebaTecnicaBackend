package com.prueba.demo.controller;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.prueba.demo.model.Message;
import com.prueba.demo.service.MessageService;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/send")
    public Message sendMessage(@RequestBody Message message) {
        return messageService.sendMessage(message);
    }

    @GetMapping("/post/{postId}/{userId}")
    public List<Message> getMessagesByPost(
    		@PathVariable Long postId, @PathVariable Long userId,
    		@RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "15") int size) {
    	
    	 Pageable pageable = PageRequest.of(page, size, Sort.by("timestamp").descending());
    	 
        return messageService.getMessagesByPost(postId, userId, pageable);
    }
}
