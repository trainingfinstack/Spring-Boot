package com.example.apidemo.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.apidemo.entities.Book;
import com.example.apidemo.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	public Iterable<Book> getBook() {
		
		return this.bookService.getAllBook();
	}
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBooks(@PathVariable("id") int id) {
		
		Book book=bookService.getById(id);
		 if(book==null) {
	    	  return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	      }
	      
	    return ResponseEntity.of(Optional.of(book));
	}	
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
	      Book b= this.bookService.addBook(book);
			return b;
		}
	
	@DeleteMapping("/books/{bookId}")
	public void deleteBook(@PathVariable("bookId") int bookId){
		this.bookService.deleteBook(bookId);
	}
	
	@PutMapping("/books/{bookId}")
	public Book updateBook(@RequestBody Book book,@PathVariable("bookId") int bookId) {
	
		this.bookService.updateBook(book,bookId);
		return book;
	}
	// Display author by id
	
	@GetMapping("/books/author/{id}")
	public String getBookAuthor(@PathVariable("id") int x) {
		
		return this.bookService.getAuthor(x);
	}
	
	// update author by id
	
	@PatchMapping("/books/{id}/{newAuthor}")
	public void updateAuthor(@PathVariable("id") int id, @PathVariable("newAuthor") String newAuthor) {
		
		this.bookService.setNewAuthor(id,newAuthor);
	}

}
