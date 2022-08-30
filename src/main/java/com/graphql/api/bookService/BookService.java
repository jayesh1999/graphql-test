package com.graphql.api.bookService;

import java.util.List;

import com.graphql.api.entities.Book;

public interface BookService {

	
	//create
	Book create(Book book);
	
	//get all
	List<Book> getAll();
	
	//get single
	Book get( int bookId);
	
}
