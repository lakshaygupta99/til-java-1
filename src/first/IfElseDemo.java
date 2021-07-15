package first;

import java.util.*;
public class IfElseDemo {
	   public static void main(String[] args) {
		   Scanner ob = new Scanner(System.in);
		   System.out.println("Enter score: ");
		   int testscore = ob.nextInt();
	       
	       char grade;
	       if(testscore >=90){
	            grade = 'A';
	       } else if(testscore >=80){
	            grade = 'B';
	       } else if(testscore >=70){
	            grade = 'C';
	       } else if(testscore >=60){
	            grade = 'D';
	       } else {
	             grade='F';
	      }
	      System.out.println("Grade = " + grade);
	   }
	}