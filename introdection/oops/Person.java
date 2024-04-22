package com.introdection.oops;

public class Person {
     String name;
      int age;
   public Person(String name) {
	   this.name=name;
	   this.age=18;
   }
   public Person(String name ,int age) {
	   this.name=name;
	   this.age=age;
   }
   public void displayInfo() {
	   System.out.println("name:"+name+ " "+"age:"+age);
   }
   public static void main(String[] args) {
	Person person1 = new Person("surya");
	person1.displayInfo();
	Person person2=new Person("jaya",23);
	person2.displayInfo();
}
}
