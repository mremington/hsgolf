package com.hsgolf.scores.domain;

import java.awt.Color;
import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Embeddable
public class School implements Serializable {
	
	
	private static final long serialVersionUID = -7509783665402030216L;
	private int id;
	private String name;
	private String mascot;
	private Color mainColor;
	private Color secondaryColor;
	private String phone;
	private String address;
	private String[] division = {"Division 1","Devision 2"};
	private League leagueId;
	
	@EmbeddedId
	public League getLeagueId() {
		return leagueId;
	}
	public void setLeagueId(League leagueId) {
		this.leagueId = leagueId;
	}
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMascot() {
		return mascot;
	}
	public void setMascot(String mascot) {
		this.mascot = mascot;
	}
	public Color getMainColor() {
		return mainColor;
	}
	public void setMainColor(Color mainColor) {
		this.mainColor = mainColor;
	}
	public Color getSecondaryColor() {
		return secondaryColor;
	}
	public void setSecondaryColor(Color secondaryColor) {
		this.secondaryColor = secondaryColor;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String[] getDivision() {
		return division;
	}
	public void setDivision(String[] division) {
		this.division = division;
	}
	
	
}
