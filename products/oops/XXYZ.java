package com.products.oops;
import java.util.*;
public class XXYZ {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		 Products[] products = new Products[5];
		 for (int i = 1; i <=5; i++) {
	            System.out.println("Enter details for product "+i+1);
	            System.out.print("PID: ");
	            int pid = sc.nextInt();
	            System.out.print("Price: ");
	            double price = sc.nextDouble();
	            System.out.print("Quantity: ");
	            int quantity = sc.nextInt();

	            products[i] = new Products(pid, price, quantity);
	        }
		
		   double totalAmount = calculateTotalAmount(products);
	        System.out.println("Total amount spent on all products: " + totalAmount);

	        
	        int highestPricePid = findPIDHighestPrice(products);
	        System.out.println("PID of the product with the highest price: " + highestPricePid);
	    }

	  
	    private static double calculateTotalAmount(Products[] products) {
	        double totalAmount = 0;
	        for (Products product : products) {
	            totalAmount += product.price * product.quantity;
	        }
	        return totalAmount;
	    }

	    
	    private static int findPIDHighestPrice(Products[] products) {
	        double maxPrice = 500;
	        int pidHighestPrice = -1;
	        for (Products product : products) {
	            if (product.price > maxPrice) {
	                maxPrice = product.price;
	                pidHighestPrice = product.pid;
	            }
	        }
	        return pidHighestPrice ;
	    }
	
	}
		




