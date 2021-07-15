package third;

interface A76 {
	int fn(int x);
}

class B2 {
	int print(int x) {
		System.out.println("This is a printing process");
		return x * x;
	}
}

class C4 {
	static int display(int x) {
		System.out.println("This is a displaying process");
		return x + x;
	}
}

public class MethodRef {
	static void api(A76 a) {
		System.out.println(a.fn(100));
	}

	public static void main(String[] ar) {
		A76 a1 = new B2()::print; // instance method
		A76 a2 = C4::display; // static
		A76 a3 = Integer::numberOfTrailingZeros; // arbitrary Object
		// static int numberOfTrailingZeros(int i)
		// Returns the number of zero bits following the lowest-order ("rightmost")
		api(a1); // a1.fn()->b.print()
		api(a2); // a2.fn() -> C.display()

		api(a3); // a3.fn()-> Integer.numberOfTrailingZeros()
	}
}
