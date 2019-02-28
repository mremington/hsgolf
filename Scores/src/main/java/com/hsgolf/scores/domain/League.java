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
public class League implements Serializable {

	private static final long serialVersionUID = 8800112542101068988L;
	private int id;
	private String name;
	private User representativeId;
	private String[] conference = {"NCC", "SCC"};
	private String[] section = {"San Diego", "Orange"};
	private String[] reigion = {"Southern", "Northern"};
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@EmbeddedId
	public User getRepresentativeId() {
		return representativeId;
	}
	public void setRepresentativeId(User representativeId) {
		this.representativeId = representativeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getConference() {
		return conference;
	}
	public void setConference(String[] conference) {
		this.conference = conference;
	}
	public String[] getSection() {
		return section;
	}
	public void setSection(String[] section) {
		this.section = section;
	}
	public String[] getReigion() {
		return reigion;
	}
	public void setReigion(String[] reigion) {
		this.reigion = reigion;
	}
	
	
}
