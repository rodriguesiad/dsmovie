package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
	
	@EmbeddedId
	
	/*como no BD essa class tem chave primaria composta, no java é necessário fazer uma classe auxiliar*/
	
	private ScorePK id =  new ScorePK(); //precisa do new por ser uma chave composta
	
	private Double value;
	
	public Score() {
	}
	
	public void setMovie(Movie movie) { //associando o filme ao score
		id.setMovie(movie);
	}
	
	public void setUser(User user) {
		id.setUser(user);
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
}
