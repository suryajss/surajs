package com.employee;

public class Employers extends Persons {
     int employeid;
     int salary;
     public Employers (String name,int age,String Employeid,double salery) {
    	 super (name,age);
    	 this.employeid=employeid;
    	 this.salary=25000;
     }
}
