package com.example.demo.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.joueur.IJoueurRepository;

@RestController @RequestMapping("/connexion/joueur")
public class Controljoueur {
	
	@Autowired
	IJoueurRepository iJoueurRepository;

}

