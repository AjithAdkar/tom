package com.ajith.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Component
@Entity(name = "Student")
public class Student {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "StudentName")
	private String name;
	@Column(name = "Phonenumber")
	private String phonenumber;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phonenumber=" + phonenumber + "]";
	}
	
}
