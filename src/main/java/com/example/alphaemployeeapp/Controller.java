package com.example.alphaemployeeapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.alphaemployeeapp.dto.User;
import com.example.alphaemployeeapp.dto.UserRepository;

@RestController
public class Controller {
	@Autowired
	UserRepository repository;

	@GetMapping("/save")
	public void save() {
		User user = new User();
		user.setId(10);
		user.setName("Vinod");

		repository.save(user);

	}

}
