package com.library.task;
import java.util.ArrayList;
import java.util.function.UnaryOperator;
public class Library {
	private ArrayList <Book> books;
	public Library() {
		books=new ArrayList <Book>();
		
	}
	public void addBook(Book book) {
		books.add(book);
	}
	public void replaceBook(Book book) {
		books.replaceAll((UnaryOperator<Book>) book);
	}
	public void removeBook(Book book) {
		books.remove(book);
	}
	public void display(Book book) {
		books.d
	}
	public ArrayList <Book> getBooks(){
		return books;
	
	}
	
}
