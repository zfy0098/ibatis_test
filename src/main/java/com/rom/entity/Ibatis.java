package com.rom.entity;

public class Ibatis {

	private int id;
	private String name;
	
	
	public Ibatis(){}
	
	public Ibatis( String name){
		this.name = name;
	}

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
	
	
}
