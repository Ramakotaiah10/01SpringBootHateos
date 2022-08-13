package com.rama.testcontroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rama.bindings.Book;

@RestController
public class StudentController {

	@GetMapping("/student/{stdid}")
	public Book getSutdentById(@PathVariable("stdid") Integer bookId) {

		Book b1 = new Book(bookId, "Spring code", "ROD JHONSON", 300.00);

		Link link = WebMvcLinkBuilder.
				linkTo(WebMvcLinkBuilder.methodOn(StudentController.class).getAllBooks())
				.withRel("All_Books");
		
		/*
		 * Link withRel = WebMvcLinkBuilder.linkTo(
		 * WebMvcLinkBuilder.methodOn(StudentController.class) .getAllBooks())
		 * .withRel("All-Books");
		 */
		b1.add(link);
		return b1;
	}

	@GetMapping("/allbooks")
	public List<Book> getAllBooks() {
		List<Book> allBooks = Arrays.asList(new Book(10, "Spring code", "ROD JHONSON", 300.00),
				new Book(11, "Spring Boot", "ROD JHONSON", 400.00), 
				new Book(12, "Spring MVC", "ROD JHONSON", 320.00),
				new Book(13, "Spring REST", "ROD JHONSON", 200.00),
				new Book(14, "Spring Security", "ROD JHONSON", 540.00));

		return allBooks;
	}
}
