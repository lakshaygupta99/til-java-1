package second;

import java.util.*;
class Employee{
	private String name;
	private int id;
	
	public Employee(String name, int id) {
		this.name=name;
		this.id = id;
	}
	
	
	public String toString() {
		return name + " " + id;
	}
}

public class MainJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Employee> lis = new Vector<Employee>();
		Employee e = new Employee("Lakshay", 32);
		lis.add(e);
		System.out.println(lis);
		
		
		Employee e2 = new Employee("John", 65);
		lis.add(e2);
		System.out.println(lis);

	}

}
