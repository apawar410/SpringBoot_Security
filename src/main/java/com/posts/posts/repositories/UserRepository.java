package com.posts.posts.repositories;

import com.posts.posts.models.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

import java.util.Optional;


public interface UserRepository extends JpaRepository <MyUser,String> {
        Optional <User> findByusername (String username);
}

