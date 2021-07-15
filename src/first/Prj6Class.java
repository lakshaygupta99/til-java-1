package first;

class Employee {
	private int Eid;
	private String Ename;

	public void paidAmount() {
		System.out.println("Normal Employee");
	}
}

class WagesEmp extends Employee {
	public void paidAmount() {
		System.out.println("Hourly Wages");
	}
}

class SalEmp extends Employee {
	public void paidAmount() {
		System.out.println("Salary Employee");
	}
}

class Frameworkf {
	public void type(Employee e) {
		e.paidAmount();
	}
}

public class Prj6Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frameworkf f = new Frameworkf();
		Employee e = new Employee();
		Employee s = new SalEmp();
		Employee w = new WagesEmp();

		f.type(e);
		f.type(s);
		f.type(w);
	}

}
