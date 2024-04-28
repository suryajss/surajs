package com.advance.java;

public class AgeNotRangeException extends Exception {
	public AgeNotRangeException(String message) {
		super(message);
	}

}
class NameNotValidException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5952099414938842179L;

	public NameNotValidException(String message){
		super(message);
	}
}
class Student{
	private int rollNo;
	private String name;
	private String course;
	
	
	public Student (int rollNo, String name, String course) throws AgeNotRangeException {
		if (rollNo <=0) {
			throw new IllegalArgumentException ("Roll number must be postive");
		}
		if (name== null || name.trim().isEmpty()) {
			throw new IllegalArgumentException ("name cannot be nll or empty");

		}
		if (course == null || course.trim().isEmpty()) {
			throw new IllegalArgumentException ("course cannot be nll or empty");

		}
		if (rollNo <15 || rollNo >21) {
			throw new AgeNotRangeException ("age must be butween 15 and 21");

		}
		this.rollNo = rollNo;
		this.name =name;
		this.course=course;
	}
	public int getRollNo() {
		return rollNo;
		
	}
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getCourse(String course) {
		return course;
	}
	public void setCourde (String course) {
		this.course =course;
	}
	public String toString() {
		return "Student{"+
	               " rollNo="+rollNo +
	               "name="+name +'\''+
	               '}';
	}
}
	