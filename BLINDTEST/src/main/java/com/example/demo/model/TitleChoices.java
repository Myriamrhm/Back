package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import com.example.demo.game.partie.Partie;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TitleChoices {
	
	public TitleChoices(long idTitleChoices, @NotEmpty String name, Partie categorie) {
		super();
		this.idTitleChoices = idTitleChoices;
		this.name = name;
		this.categorie = categorie;
	}

	protected TitleChoices() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTitleChoices;
	
	@NotEmpty
	private String name;
	
	@ManyToOne
	@JoinColumn(name="idCategorie")
	private Partie categorie;
	
	
}
