package com.springboot.lpalindrome.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "lspalindrome")
public class StringData {
	@Id
	@GeneratedValue
    private int id;
	private String str;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public StringData() {
			}

	public StringData(int id, String str) {
		super();
		this.id = id;
		this.str = str;
	}

	@Override
	public String toString() {
		return "StringData [id=" + id + ", str=" + str + "]";
	}
	
	
	
}
