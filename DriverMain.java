package com.library.task;
import java.util.*;
public class DriverMain {
public static void main(String[] args) {
	
	
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("**** ENTER EMPLOYEE INFORMATION*****");
		System.out.println("Employee Id :");
//    	int empId=sc.nextInt();
       	sc.nextLine();
		System.out.println("Employee name :");
		String name =sc.nextLine();
		sc.nextLine();
		System.out.println("Employee Salary :");
		double salary=sc.nextDouble();
//		Employe emp =new Employe (empId,name,salary);
		
		System.out.println("=====================================================");
		System.out.println("**** \nENTER PRODUCT INFORMATION");
		System.out.println("product Id:");
		int pid=sc.nextInt();
//		sc.nextLine();
		System.out.println("Product price :");
		double price=sc.nextDouble();
		sc.nextLine();
		System.out.println("Product quantity");
		int quantity =sc.nextInt();
		System.out.println("===========================================================");
		
	Product pro =new Product(pid, price, quantity);
		
//	double incomeTax =emp.calcTax();
	double  salesTax =pro.calcTax();
//	System.out.println("\nincome Tax :"+incomeTax);
		System.out.println("\nsales Tax :"+salesTax);
		
	}
}
