package com.prueba.demo.service;

import java.util.List;

import com.prueba.demo.model.Post;

public interface PostService {
    Post createPost(Post post);
    List<Post> getAllPosts();
}