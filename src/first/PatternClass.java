package first;

import java.util.*;
public class PatternClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		int a = sc.nextInt();
		for(int i = 0;i<=a;i++) {
			for(int j = 0;j<i+1;j++)
			System.out.print(i + " ");
			
			System.out.println();
		}
		
		
		System.out.println("Enter second input: ");
		int b = sc.nextInt();
		for(int i = 1;i<=b;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
