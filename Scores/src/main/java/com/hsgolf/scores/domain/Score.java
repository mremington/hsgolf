package com.hsgolf.scores.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Score {
	
	private long id;
	private User playerId;
	private Course courseId;
	
	@EmbeddedId
	public User getPlayerId() {
		return playerId;
	}
	public void setPlayerId(User playerId) {
		this.playerId = playerId;
	}
	
	@EmbeddedId
	public Course getCourseId() {
		return courseId;
	}
	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}
	private int strokes;
	private float index;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getStrokes() {
		return strokes;
	}
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}
	public float getIndex() {
		return index;
	}
	public void setIndex(float index) {
		this.index = index;
	}
	
	
}
