package com.example.demo.game.partie;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

import com.example.demo.game.choix.Choix;
import com.example.demo.model.TitleChoices;
import com.example.demo.model.joueur.Joueur;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Partie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPartie;
	
	@NotEmpty
	private String nameCategory;
	
	public int compteurScore;
	
	@OneToMany(mappedBy="partie")
	private List<Choix> listchoix; 
	
	@OneToOne
	@JoinColumn(name="idJoueur")
	private Joueur joueur;
	
	protected Partie() {
	}
	
	public Partie(long idPartie, @NotEmpty String nameCategory, int compteurScore, 
			List<Choix> listchoix, Joueur joueur) {
		this.idPartie = idPartie;
		this.nameCategory = nameCategory;
		this.compteurScore = compteurScore;
		this.listchoix = listchoix;
		this.joueur = joueur;
	}
	
}
