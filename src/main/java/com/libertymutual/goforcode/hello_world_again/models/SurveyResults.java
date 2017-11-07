package com.libertymutual.goforcode.hello_world_again.models;

public class SurveyResults {

	private int russetCount;
	private int sweetCount; 
	private int goldenCount;
	private int newCount;
	
	public int russetTotal() {
		return russetCount;
	}
	
	public int sweetTotal() {
		return sweetCount;
	}

	public int goldenTotal() {
		return goldenCount;
	}
	
	public int newTotal() {
		return newCount;
	}
	
	public void registerRussetVote() {
		russetCount = russetCount + 1;
	}
	public void registerNewVote() {
		newCount = newCount + 1;
	}
	public void registerSweetVote() {
		sweetCount = sweetCount + 1;
	}
	public void registerGoldenVote() {
		goldenCount = goldenCount + 1;
	}
}
