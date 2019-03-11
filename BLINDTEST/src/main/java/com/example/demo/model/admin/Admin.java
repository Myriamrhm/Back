package com.example.demo.model.admin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import com.example.demo.game.partie.Partie;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAdmin;
	
	@NotEmpty 
	private String nom;
	
	@NotEmpty 
	private String mail;
	
	@NotEmpty
	private String password;

	public Admin(@NotEmpty String nom, @NotEmpty String mail, @NotEmpty String password) {
		this.nom = nom;
		this.mail = mail;
		this.password = password;
	}
	
	protected Admin() {
	}

}
