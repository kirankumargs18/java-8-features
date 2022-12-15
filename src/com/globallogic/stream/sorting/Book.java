package com.globallogic.stream.sorting;

public class Book {

	private String name;
	private int noOfPages;

	public Book(String name, int noOfPages) {
		super();
		this.name = name;
		this.noOfPages = noOfPages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", noOfPages=" + noOfPages + "]";
	}

}
