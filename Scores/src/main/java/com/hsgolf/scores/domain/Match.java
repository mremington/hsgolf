package com.hsgolf.scores.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Match {
	private long id;
	//private int homeTeam;
	//private int awayTeam;
	//private int course;
	private String dateAndTime;
	private String[] matchType = {"League", "NonLeague"};
	private String[] result = {"Win", "Loss", "Tie"};
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDateAndTime() {
		return dateAndTime;
	}
	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	public String[] getMatchType() {
		return matchType;
	}
	public void setMatchType(String[] matchType) {
		this.matchType = matchType;
	}
	public String[] getResult() {
		return result;
	}
	public void setResult(String[] result) {
		this.result = result;
	}
	
	
}
