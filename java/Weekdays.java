package com.advance.java;
import java.util.*;
public class Weekdays {
	public static void main(String[] args) {
		String[] Weekdays = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the position (0-6)");
	int dayIndex =sc.nextInt();
	
	try {
		String dayName=getDayName(Weekdays,dayIndex);
		System.out.println("Day name :"+dayName);
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("invlid day index . plese enter a number between 0and 6.");
	}
		}

	private static String getDayName(String[] weekdays, int dayIndex) {
		return weekdays[dayIndex];
	}
	

}
