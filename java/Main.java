package com.advance.java;

public class Main {
	public static void main(String[] args) {
        try {
            Student student1 = new Student(101, "John Doe", "Computer Science");
            System.out.println(student1);

          
        } catch (AgeNotRangeException e) {
            e.printStackTrace();
        }
    }

	}


