package com.graphql.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.graphql.api.bookService.BookService;
import com.graphql.api.entities.Book;

@SpringBootApplication
public class GraphQlApplication  implements CommandLineRunner{


	@Autowired
	private BookService bookService;
	
	public static void main(String[] args) {
		SpringApplication.run(GraphQlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Book b1 =  new Book();
		b1.setTitle("Spring boot compleate reference");
		b1.setDesc("complete spring boot");
		b1.setPages(5000);
		b1.setPrice(50000);
		b1.setAuthor("jayesh");
		

		Book b2 =  new Book();
		b2.setTitle("Spring core compleate reference");
		b2.setDesc("complete spring core");
		b2.setPages(4000);
		b2.setPrice(40000);
		b2.setAuthor("Albert");
		
		this.bookService.create(b2);
		this.bookService.create(b1);
		
	}

}
