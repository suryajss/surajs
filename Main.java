package com.library.task;

public class Main {
public static void main(String[] args) {
	Library library =new Library();
	
	Book book1 = new Book( "Wings of fire","A.P.J");
	Book book2 =new Book("Turning Points","A.P.J");
	Book book3 =new Book("Ignited Minds","A.P.J");
	Book book4 =new Book("You Are Born To Blossom","A.P.J");
	
	library.addBook(book1);
	library.addBook(book2);
	library.addBook(book3);
	library.addBook(book4);
	
	System.out.println("Books in the library :");
	for (Book book:library.getBooks()) {
		System.out.println(book.tittle+"by"+book.author);
	}
	library.removeBook(book2);
	System.out.println("\nbooks in the library after removing"+book2);
	for(Book book:library.getBooks()) {
		System.out.println(book.tittle+"by"+book.author);
	}
  
		
	}
}


