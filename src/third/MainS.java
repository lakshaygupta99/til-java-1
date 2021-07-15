package third;

class A6 {
	int x;

	public A6 print() {
		System.out.println("Next Iteration is from print() : " + x);
		return new A6(8);
	}

	public A6 forward() {
		System.out.println("Next Iteration is from forward(): " + x);
		return new A6(5);
	}

	public void last() {
		System.out.println("last Iteration : " + x);
	}

	public A6(int a) {
		x = a;
	}

	public A6() {
	}
}

public class MainS {
	public static void main(String[] ar) {
		A6 a = new A6(9);
		a.print().forward().print().forward().last();
	}
}