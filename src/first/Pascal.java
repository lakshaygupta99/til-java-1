package first;

import java.util.*;

public class Pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows, c = 1, a;
		System.out.print("Input number of rows: ");
		Scanner in = new Scanner(System.in);
		rows = in.nextInt();

		// gupta.monicag@gmail.com

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows - i; j++) {
				System.out.print(" ");
			}

			for (int h = 0; h <= i; h++) {
				if (h == 0 || i == 0) {
					c = 1;
				} else {
					c = c * (i - h + 1) / (h);
				}
				System.out.print(c + " ");
			}
			System.out.println();

		}

		int matrix[][];

	}

}
