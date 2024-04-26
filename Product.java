package com.library.task;

public class Product implements Taxable {
	
//	private static final int  salesTax1  = 0;
	int pid;
	double price;
	int quantity;
//	private double salesTax;

public Product(int pid ,double price,int quantity) {
	this.pid=pid;
	this.price=price;
	this.quantity=quantity;
}

//public  double calcTax() {
//	double salesTaxes=price*quantity* sales_tax;
//	return salesTaxes;
	


public double calcTax() {
	// TODO Auto-generated method stub
	return 0;
}
}