package com.dailycodebuilder.kafka.apachekafkaproducerdemo;

public class Book {
	
	private String bookName;
	private String isbn;
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getBookName() {
		return bookName;
	}
	public String getIsbn() {
		return isbn;
	}
	public Book(String bookName, String isbn) {
		super();
		this.bookName = bookName;
		this.isbn = isbn;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
