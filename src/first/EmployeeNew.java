package first;

import java.util.*;

class Employees {
	static int count;
	private String name;
	private int id;

	public Employees(String name, int id) {
		this.name = name;
		this.id = id;
		count++;
	}

	public static void displayCount() {
		System.out.println("Number of employees: " + count);
	}

}

public class EmployeeNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (;;) {
			System.out.println("Select from the following options: ");
			System.out.println("1 Add Employee");
			System.out.println("2 Display number of employees");
			System.out.println("3 Exit");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Enter name and id of employee");
				Scanner ob = new Scanner(System.in);
				String s = ob.nextLine();
				int idE = ob.nextInt();
				Employees e = new Employees(s, idE);
				break;

			case 2:
				Employees.displayCount();
				break;
			case 3:
				return;

			default:
				return;
			}

		}

	}

}
