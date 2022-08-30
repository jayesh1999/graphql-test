package com.graphql.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphql.api.entities.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {
	

}
