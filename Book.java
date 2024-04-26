package com.library.task;

public class Book {
	 int bookId;
	  String tittle;
	  String author;
	  boolean isavilable;
	  
	  
	  public Book(String tittle, String author) {
		  this.bookId=bookId;
		  this.tittle =tittle;
		  this.author =author;
		  this.isavilable =true;
		  
	  }
	  public void setavilable(boolean avilable) {
		  isavilable=avilable;
	  }
	  public String toString() {
		  return "book ID :"+bookId +",title :"+tittle +"Author:"+author +"Avilable:"+isavilable;
		  
	  }
	  
	}

