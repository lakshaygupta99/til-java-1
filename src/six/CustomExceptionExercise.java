package six;

import java.util.*;

class AgeException extends Exception {
	AgeException(String s) {
		super(s);
	}
}

class DuplicateNameException extends Exception {
	DuplicateNameException(String s) {
		super(s);
	}
}

class Employee {
	int age;
	String name;

	Employee(int age, String name) {
		this.age = age;
		this.name = name;
	}

}

public class CustomExceptionExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> list = new HashMap<String, Integer>();

		list.put("Lakshay",22);
		list.put("John", 56);
		list.put("Ted", 43);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name and age");
		String name = sc.nextLine();

		try {
			if (list.containsKey(name)) {
				throw new DuplicateNameException("Duplicate names are not allowed as Employees!");
			}
		} catch (DuplicateNameException e) {
			System.out.println(e);
		}

		int age = sc.nextInt();

		try {
			if (age < 0)
				throw new AgeException("Ghosts are not allowed as Employees");

			else if (age < 18)
				throw new AgeException("Children are not allowed as Employees");

			else if (age > 60)
				throw new AgeException("Seniors are not allowed as Employees");

			else if (age > 100)
				throw new AgeException("Purvaj are not allowed as Employees");

		} catch (AgeException e) {
			System.out.println(e);
		}

	}

}
