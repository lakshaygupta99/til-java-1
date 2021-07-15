package first;

import java.util.*;

public class ScannerClass {
	public static void main(String args[]) {
		int a;
		// declare object of Scanner Class
		Scanner buf = new Scanner(System.in);
		System.out.print("Enter value of a :");
		/* nextInt() method of Scanner class */
		a = buf.nextInt();
		System.out.println("Value of a:" + a);
	}
}