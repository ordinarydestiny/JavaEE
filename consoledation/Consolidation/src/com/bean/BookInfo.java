package com.bean;

public class BookInfo {
	private Integer id;
	private String bookname;
	private String author;
	private String pubhouse;
	private double pricce;
	private String intime; 
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPubhouse() {
		return pubhouse;
	}
	public void setPubhouse(String pubhouse) {
		this.pubhouse = pubhouse;
	}
	public double getPricce() {
		return pricce;
	}
	public void setPricce(double pricce) {
		this.pricce = pricce;
	}
	public String getIntime() {
		return intime;
	}
	public void setIntime(String intime) {
		this.intime = intime;
	}
}
