package com.example.alphaemployeeapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.alphaemployeeapp.dto.User;
import com.example.alphaemployeeapp.dto.UserRepository;

@SpringBootApplication
public class AlphaemployeeappApplication {



	public static void main(String[] args) {
		SpringApplication.run(AlphaemployeeappApplication.class, args);
		
	}

}
