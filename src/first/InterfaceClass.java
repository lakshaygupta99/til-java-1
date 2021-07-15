package first;

interface printable {
	void print();
}

public class InterfaceClass implements printable {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		InterfaceClass obj = new InterfaceClass();
		obj.print();
	}
}
