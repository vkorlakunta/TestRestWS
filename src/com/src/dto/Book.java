package com.src.dto;

public class Book {
	private String id;
	private String name;
	private String catogiroy;
	
	public Book(String id, String name, String catogiroy) {
		this.id = id;
		this.name = name;
		this.catogiroy = catogiroy;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCatogiroy() {
		return catogiroy;
	}
	public void setCatogiroy(String catogiroy) {
		this.catogiroy = catogiroy;
	}

}
