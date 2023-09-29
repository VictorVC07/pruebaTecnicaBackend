package com.prueba.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.demo.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {}