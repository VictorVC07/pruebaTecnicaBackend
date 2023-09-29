package com.prueba.demo.model;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;

	@Entity
	@Data
	public class Message {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private Long senderUserId;
	    private Long receiverUserId;
	    private String messageText;
	    private Date timestamp;
	
	    @ManyToOne
	    @JoinColumn(name = "post_id")
	    private Post post;
	
	
	}
