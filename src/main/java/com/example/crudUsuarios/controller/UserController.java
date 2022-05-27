package com.example.crudUsuarios.controller;

import java.util.List;

import com.example.crudUsuarios.model.User;
import com.example.crudUsuarios.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping
	public List<User> findAll(){
		return userRepo.findAll();
	}


}
