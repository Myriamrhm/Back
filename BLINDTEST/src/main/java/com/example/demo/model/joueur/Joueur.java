package com.example.demo.model.joueur;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.example.demo.game.partie.Partie;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Joueur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idJoueur;

	@NotEmpty
	private String pseudo;
	
	@NotEmpty 
	private String mail;
	
	@NotEmpty
	private String password;
	
	@NotNull @NotEmpty
	private int score;
	
	@OneToOne
	@JoinColumn(name="idPartie")
	private Partie partie;
	
	protected Joueur() {
	}
	
	public Joueur(@NotEmpty String pseudo, @NotEmpty String mail, @NotEmpty String password,
			@NotNull @NotEmpty int score) {
		this.pseudo = pseudo;
		this.mail = mail;
		this.password = password;
		this.score = score;
	}
}
