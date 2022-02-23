package com.posts.posts.controllers;

import com.posts.posts.models.MyUser;
import com.posts.posts.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")

public class UserController {

   @Autowired
    UserRepository userRepository;

    @PostMapping ("/create")
    public String createUser (@RequestBody MyUser myUser) {
        return userRepository.save (myUser).getUsername ();
    }

    @DeleteMapping ("/remove/{username}")
    public void removeUser (@PathVariable String username) {
        System.out.println ("Received username as " + username);
        userRepository.deleteById (username);
   }
}
