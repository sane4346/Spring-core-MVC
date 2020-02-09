package com.spring.boot.SpringBootApp;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		Book book = new Book("1001", "Spring book", "Santosh");
		return Arrays.asList(book);
	}
	

}
