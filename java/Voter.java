package com.advance.java;
import java.util.*;
public class Voter {

		int voterId;
		String name;
		private String num;
		 public String eligiable(int age) {
			 if(age>=18) {
				 return "eigiable voter";
			 }
			 else {
				 return "invalid age for voter";
			 }
		 }
		
		public Voter(int voterid, String name ,int age) throws InvalidAgeException{
			if(age<18) {
				throw new InvalidAgeException("invalid age for voter ");
			}
			this.voterId=voterid;
			this.name=name;
			
			
		}
		 public Voter() {
			// TODO Auto-generated constructor stub
		}

		public String toString() {
		        return "Voter{" +
		                "voterId=" + voterId +
		                ", name='" + name + '\'' +
		                
		                '}';
		      
		    }
		    public static void main(String[] args) {
		    	Scanner sc =new  Scanner(System.in);
		    	System.out.println("enter your age");
		    	int num =sc.nextInt();
		    	Voter vt = new Voter();
		    	String votestatus =vt.eligiable(num);
		    	System.out.println(votestatus);
		        try {
		            Voter voter1 = new Voter(1, "jaya", 25);
		            System.out.println(voter1);

		            // This will throw InvalidAgeException
		            // Voter voter2 = new Voter(2, "Jane Doe", 16);
		        } catch (InvalidAgeException e) {
		            e.printStackTrace();
		        }
		    }
		}



