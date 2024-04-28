package com.advance.java;
import java.util.HashMap;
import java.util.Map;
public class StudentGrades {
	Map<String ,Integer> studentGrades;
	
	public StudentGrades() {
		studentGrades = new HashMap<>();
	}
	public void addStudent(String name ,int grade) {
		studentGrades.put(name, grade);
	}
	public void removeStudent(String name) {
		studentGrades.remove(name);
	}
	public void displayAllStudent(String string) {
		for(Map.Entry<String,Integer> entry : studentGrades.entrySet()) {
			System.out.println("student :"+entry.getKey()+"grade :"+entry.getValue());
			
		}
	}
	public static void main(String[] args) {
		StudentGrades studentGrades = new StudentGrades();
		
		studentGrades.addStudent("jaya", 89);
		studentGrades.addStudent("arun", 87);
		studentGrades.addStudent("karthik",82);
		studentGrades.addStudent("surya", 86);
		
		System.out.println("All students and their grades :");
		studentGrades.displayAllStudent("jaya");
		
		System.out.println("\nDisplaying grade by name:");
		studentGrades.displayAllStudent("kathik");
		
		studentGrades.removeStudent("arun");
		
		System.out.println("\nAll students after removal :");
		studentGrades.displayAllStudent(null);
	}
}