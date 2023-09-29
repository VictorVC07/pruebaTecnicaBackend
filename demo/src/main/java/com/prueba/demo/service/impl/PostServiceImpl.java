package com.prueba.demo.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.demo.model.Post;
import com.prueba.demo.repository.PostRepository;
import com.prueba.demo.service.PostService;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post createPost(Post post) {
        // Lógica para crear una publicación y guardarla en la base de datos
        return postRepository.save(post);
    }

    @Override
    public List<Post> getAllPosts() {
        // Lógica para obtener todas las publicaciones
        return postRepository.findAll();
    }
}