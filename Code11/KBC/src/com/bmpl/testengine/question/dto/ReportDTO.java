package com.bmpl.testengine.question.dto;

public class ReportDTO {
	
	private int qid;
	private String qname;
	private String rans;
	private String yourAns;
	private int score;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public String getRans() {
		return rans;
	}
	public void setRans(String rans) {
		this.rans = rans;
	}
	public String getYourAns() {
		return yourAns;
	}
	public void setYourAns(String yourAns) {
		this.yourAns = yourAns;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	

}
