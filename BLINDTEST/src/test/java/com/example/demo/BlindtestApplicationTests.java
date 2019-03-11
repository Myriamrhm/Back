package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.joueur.IJoueurRepository;
import com.example.demo.model.joueur.Joueur;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlindtestApplicationTests {
	
	@Autowired
	IJoueurRepository joueur;
	
	@Autowired
	IJoueurRepository admin;

	@Test
	public void contextLoads() {
	}
	@Test
	public void creerDesJoueurs() {
		Joueur myriam = new Joueur("Mimi", "mymy@gmail.com", "password", 650);
		joueur.save(myriam);
	}

}
