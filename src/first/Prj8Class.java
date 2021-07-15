package first;
public class Prj8Class {
	public static void main(String[] args) {
		Emp1 e1=new Emp1();
		Emp1 e2=new Emp1(5000);
	}
}
class Emp1 { 
	int sal;
	public Emp1() {
		sal = 0;
		System.out.println("Default constructor in Emp1loyee with sal : " + sal);
	}
	public Emp1(int s) {
		sal=s;
		System.out.println("Parameterized Constructor in Emp1loyee for initialising attribute sal : "+ sal);
	}
}
