package com.hsgolf.scores.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Embeddable
public class Course implements Serializable {

	private static final long serialVersionUID = -7150949196998493314L;
	private int id;
	private Teebox teeboxId;
	private String name;
	private int frontNinePar;
	private int backNinePar;
	private String phone;
	private String address;
	
	@EmbeddedId
	public Teebox getTeeboxId() {
		return teeboxId;
	}
	public void setTeeboxId(Teebox teeboxId) {
		this.teeboxId = teeboxId;
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
	public int getFrontNinePar() {
		return frontNinePar;
	}
	public void setFrontNinePar(int frontNinePar) {
		this.frontNinePar = frontNinePar;
	}
	public int getBackNinePar() {
		return backNinePar;
	}
	public void setBackNinePar(int backNinePar) {
		this.backNinePar = backNinePar;
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
	
	
}
