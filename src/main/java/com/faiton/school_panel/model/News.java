package com.faiton.school_panel.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class News {

    @Id
    // @GeneratedValue( strategy = GenerationType.AUTO )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    private Date date;

    public News() {
	}

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


}