package first;

class A2{
	static {
		System.out.println("Static block initializer called");
	}
	int x;
	{
		System.out.println("Initializer called");
		x=10;
	}
	public void display() {
		System.out.println("Value of x: "+x);
	}
	public static  void display2() {
		System.out.println("static method");
	}
}

public class MainApp { //java MainApp -> run -> MainApp.main(String[]);
	static {
		System.out.println("Static block: called even before main(static method)");
	}

	public static void main(String[] args) {
		System.out.println("Before Instance created, but class Name is used: ");
		A2 a;
		System.out.println("Instance created: ");
		a=new A2();
		a.display();
		A2.display2();
		a.display2();

	}

}
