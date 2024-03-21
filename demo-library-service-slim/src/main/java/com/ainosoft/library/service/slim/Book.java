package com.ainosoft.library.service.slim;

import java.io.Serializable;

import org.appops.core.annotation.Slim;

@Slim
public class Book implements Serializable {
	private static final long serialVersionUID = -612296800346536751L;
	private String bookName;
	private String authorName;
	private Integer pages;
	
	public Book() {
		
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
}
