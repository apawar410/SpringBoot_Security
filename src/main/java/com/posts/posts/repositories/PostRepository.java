package com.posts.posts.repositories;

import com.posts.posts.models.Posts;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository < Posts ,Long > {

}
