package com.graphql.api.bookService.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.graphql.api.bookService.BookService;
import com.graphql.api.entities.Book;
import com.graphql.api.repository.BookRepo;

@Component
public class BookServiceImpl implements BookService{

	
	@Autowired
	private BookRepo repo;
	
	
	@Override
	public Book create(Book book) {
		return this.repo.save(book);
	}

	@Override
	public List<Book> getAll() {
		
		return this.repo.findAll();
	}

	@Override
	public Book get(int bookId) {
		return this.repo.findById(bookId).orElseThrow(()-> new RuntimeException("Book is not found with id"));
	}

}
