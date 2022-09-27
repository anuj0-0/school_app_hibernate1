package com.ty.school.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReferenceBook {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Book_id")
	private int id;
	private String name;
	private String author;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	private String subject;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "ReferenceBook [id=" + id + ", name=" + name + ", author=" + author + ", subject=" + subject + "]";
	}
}
