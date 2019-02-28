package com.hsgolf.scores.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teebox {
	
	private int id;
	private String description;
	private int mensSlope;
	private float mensRating;
	private int womansSlope;
	private float womansRating;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getMensSlope() {
		return mensSlope;
	}
	public void setMensSlope(int mensSlope) {
		this.mensSlope = mensSlope;
	}
	public float getMensRating() {
		return mensRating;
	}
	public void setMensRating(float mensRating) {
		this.mensRating = mensRating;
	}
	public int getWomansSlope() {
		return womansSlope;
	}
	public void setWomansSlope(int womansSlope) {
		this.womansSlope = womansSlope;
	}
	public float getWomansRating() {
		return womansRating;
	}
	public void setWomansRating(float womansRating) {
		this.womansRating = womansRating;
	}
	
	
}
