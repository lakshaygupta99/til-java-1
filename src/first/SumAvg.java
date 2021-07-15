package first;

import java.util.*;
public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = obj.nextInt();
		System.out.println("Enter second number: ");
		
		int b = obj.nextInt();
		
		
		System.out.println("Sum: " + (a + b));
		
		System.out.println("Average: " + (a+b)/2);
	}

}
