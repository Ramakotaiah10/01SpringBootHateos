package com.rama.bindings;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book extends RepresentationModel<Book> {

	private Integer bookId;
	private String bookName;
	private String authorName;
	private double bookPrice;
	
}
