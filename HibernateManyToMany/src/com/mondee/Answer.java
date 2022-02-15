package com.mondee;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Answer")
public class Answer {
	
	@Id
	@Column(name="aid")
	private int aid;
	
	@Column(name="answer")
	private String answer;
	@Column(name="answeredby")
	private String answeredby;
	
	@ManyToMany(mappedBy="answers")
	private List<Question>questions;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnsweredby() {
		return answeredby;
	}
	public void setAnsweredby(String answeredby) {
		this.answeredby = answeredby;
	}
	

}
