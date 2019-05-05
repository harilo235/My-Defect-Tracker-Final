package com.sgic.defect.controller;

import com.sgic.defect.entity.User;
import com.sgic.defect.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    //find all user
    @GetMapping("/findAllUser")
    public List<User> findAll(){
        return userService.getAllUser();
    }

    //find user by id
    @GetMapping("/findUserById")
    public ResponseEntity <User> findUserById(@PathVariable("id") Long id){
        return new ResponseEntity<User>(userService.findUserByUserId(id), HttpStatus.OK);
    }

    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity <User> deleteUserById (@PathVariable("id") Long id){
        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
    }

    //update project
    @PutMapping("/updateUser")
    public ResponseEntity<User> updateProject (@Valid @RequestBody User user){
        userService.updateUser(user);
        return new ResponseEntity<User> (HttpStatus.OK);
    }

    //saveUser
    @PostMapping("/saveProject")
    public HttpStatus saveUser (@Valid @RequestBody User user){
        userService.saveUser(user);
        return HttpStatus.CREATED;
    }
}
