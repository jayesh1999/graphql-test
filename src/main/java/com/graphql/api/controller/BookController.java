package com.graphql.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RestController;

import com.graphql.api.bookService.BookService;
import com.graphql.api.entities.Book;

@RestController
@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@MutationMapping("createBook")
	public Book create(@Argument BookInput book) {
		Book b = new Book();
		b.setTitle(book.getTitle());
		b.setDesc(book.getDesc());
		b.setPrice(book.getPrice());
		b.setAuthor(book.getAuthor());
		b.setPages(book.getPages());
		return this.bookService.create(b);
	}
	
	@QueryMapping("allBooks")
	public List<Book> getAllBook() {
		return this.bookService.getAll();
	}
	
	@QueryMapping("getBook")
	public Book getSingleBook(@Argument int bookId) {
		return this.bookService.get(bookId);
	}
	
	
}

class BookInput{
	private String title;
	private  String desc;
	private String author;
	private double price;
	private int pages;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public BookInput(String title, String desc, String author, double price, int pages) {
		super();
		this.title = title;
		this.desc = desc;
		this.author = author;
		this.price = price;
		this.pages = pages;
	}
	
	
	
}
