package com.library.task;

public abstract class Employe implements Taxable {
     int empId;
     String name;
     double salary;
     
     public Employe(int empId, String name, double salary ) {
    	 this.empId=empId;
    	 this.name=name;
    	 this.salary=salary;
     }
     public double calcTax() {
		return salary*incomeTax;
		
    	 
     }
}
