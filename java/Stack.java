package com.advance.java;

public class Stack {
 int maxSize;
 int[] stackArray;
 int top;
 
 public Stack(int size) {
	 maxSize =size;
	 stackArray = new int [maxSize];
	 top =-1;
 }
 public void push(int element) {
	 if(isfull()) {
		 System.out.println("stsack is full cannot push element"+element);
		 return;
	 }
	 stackArray[++top] =element;
	 
 }
 private boolean isfull() {
	// TODO Auto-generated method stub
	return false;
}
public boolean isEmpty() {
	 return (top ==-1);
 }
 public int peek() {
	 if (isEmpty()) {
		 System.out.println("stack is empty.no element to peek.");
		 return -1;
	 }
 
	 return stackArray[top];
 }
 public void display() {
	 if(isEmpty()) {
		 System.out.println("stsclk is empty.");
		 return;
	 }
	 System.out.println("stack :");
	 for(int i=top;i>=0;i--) {
		 System.out.println(stackArray[i] +" ");
	 }
	 
 }
 public static void main(String[] args) {
	Stack stack =new Stack(5);
	
	stack.push(87);
	stack.push(54);
	stack.push(95);
	stack.push(78);
	stack.push(90);
	stack.display();
	System.out.println("popped element:"+stack.pop());
	  System.out.println("Top element: " + stack.peek()); // Output: Top element: 40

      System.out.println("Size of stack: " + stack.size()); // Output: Size of stack: 4
}
private String size() {
	// TODO Auto-generated method stub
	return null;
}
private String pop() {
	// TODO Auto-generated method stub
	return null;
}
 
 
}
