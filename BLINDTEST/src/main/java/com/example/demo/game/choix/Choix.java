package com.example.demo.game.choix;

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
public class Choix {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idChoix;
	
	@NotEmpty
	private String name;
	
	@ManyToOne
	@JoinColumn(name="idPartie")
	private Partie partie;
	
	public Choix(long idChoix, @NotEmpty String name, Partie partie) {
		this.idChoix = idChoix;
		this.name = name;
		this.partie = partie;
	}

	protected Choix() {
	}
	
}
