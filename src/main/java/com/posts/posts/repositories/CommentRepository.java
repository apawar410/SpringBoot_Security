package com.posts.posts.repositories;

import com.posts.posts.models.Comments;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository <Comments,Long> {

}
