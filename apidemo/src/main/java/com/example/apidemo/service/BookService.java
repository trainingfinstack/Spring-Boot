package com.example.apidemo.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.apidemo.dao.BookRepository;
import com.example.apidemo.entities.Book;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository ;

	//Display all book record 
	public Iterable<Book> getAllBook(){
	Iterable<Book> list= this.bookRepository.findAll();
		return list;
	}
	//Display book record by id
	public Book getById(int id){
		
		Book book =null;
		book=this.bookRepository.findById(id);
		return book;
	}
    //Add book record
	public Book addBook(Book b) {
		Book result=bookRepository.save(b);
		return result;
	
	} 
	//Delete book record
	public void deleteBook(int bid) {
		
		bookRepository.deleteById(bid);
	}
	
	//Update Book
	public void updateBook(Book book, int bookId) {
		
		book.setId(bookId);
		bookRepository.save(book);
	}
	
	//get author by id
	public String getAuthor(int id) {
		
	Book x=	bookRepository.findById(id);
	
		return x.getAuthor();
	}
	
	// update author name
	public void setNewAuthor(int id,String name) {
		Book book5 =null;
		book5=this.bookRepository.findById(id);
		book5.setAuthor(name);
		bookRepository.save(book5);
	}
	
}
