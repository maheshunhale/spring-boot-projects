package com.springboot.basics.springbootstarter;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	// "/books"
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return Arrays.asList(new Book(1L, "JPA", "KC"), new Book(2L, "Struts", "PGA"));
	}
}
