package com.employee;

public class Main {
	public static void main(String[] args) {
		Employers emp1=new Employers("surya",21,"21AUCSN0025",25000);
		System.out.println("Employe name :"+emp1.name);
		System.out.println("Employe age :"+emp1.age);
		System.out.println("Employe ID :"+emp1.employeid);
		System.out.println("Employe salary :"+emp1.salary);
	}

}
