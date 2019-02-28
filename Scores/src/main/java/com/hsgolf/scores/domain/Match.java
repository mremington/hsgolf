package com.hsgolf.scores.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Match {
	
	private long id;
	private School homeTeamId;
	private School awayTeamId;
	private Course courseId;
	private String dateAndTime;
	private String[] matchType = {"League", "NonLeague"};
	private String[] result = {"Win", "Loss", "Tie"};
	
	
	@EmbeddedId
	public School getHomeTeamId() {
		return homeTeamId;
	}
	public void setHomeTeamId(School homeTeamId) {
		this.homeTeamId = homeTeamId;
	}
	@EmbeddedId
	public School getAwayTeamId() {
		return awayTeamId;
	}
	public void setAwayTeamId(School awayTeamId) {
		this.awayTeamId = awayTeamId;
	}
	@EmbeddedId
	public Course getCourseId() {
		return courseId;
	}
	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}
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
