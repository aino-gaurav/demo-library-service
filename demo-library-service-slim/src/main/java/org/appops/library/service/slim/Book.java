package org.appops.library.service.slim;

import org.appops.core.annotation.Slim;

@Slim
public class Book  {
	
	private String bookName;
	private String authorName;
	private Integer pages;
	
	public Book() {
		
	}
	
	public Book(String bookName, String authorName, Integer pages) {
		setBookName(bookName);
		setAuthorName(authorName);
		setPages(pages);
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
