package first;

class Adder1 {
	public int x; // instance variable; its scope is it's Object scope
	public int y;
	public static int count = 0;// class variable; its scope is the class or any of its object scope

	public Adder1(int a, int b) {
		x = a;
		y = b;
		count++;
	}

	public Adder1() {
		x = y = 0;
		count++;
	}

	public int add(int a) { // a is a parameter variable
		int b = 0; // local variable
		// local variable and parameter variable have scope within the function
		return x + y + a + b;
	}

}

public class Prj9Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder1 a = new Adder1(7, 8);

		System.out.println("a.x (instance variable is: " + a.x);
		System.out.println("a.count (static/class variable is: " + a.count);
		System.out.println("Adder1.count (static/class variable is: " + Adder1.count);
		System.out.println("a.add(4 as parameter variable) and b=10 as local variable is: " + a.add(4));

	}

}
