package com.example.demo;

public class LimitConfig {

	private int maximun;
	private int minimun;
	
	public LimitConfig(int maximun, int minimun) {
		super();
		this.maximun = maximun;
		this.minimun = minimun;
	}
	
	public int getMaximun() {
		return maximun;
	}
	public void setMaximun(int maximun) {
		this.maximun = maximun;
	}
	public int getMinimun() {
		return minimun;
	}
	public void setMinimun(int minimun) {
		this.minimun = minimun;
	}
	
	
}
