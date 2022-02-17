package com.posts.posts.controllers;

import com.posts.posts.models.Posts;
import com.posts.posts.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    PostRepository postRepository;

    @PostMapping ("/posts")
    public Posts createPost (@RequestBody Posts post) {

        return postRepository.save (post);
    }

}
