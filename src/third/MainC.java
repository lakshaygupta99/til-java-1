package third;

interface A0 { // case 3
	// curly braces are optional if we have a single statement only.
	// Not in case of multiple statements or with return keyword
	void fn(int x);
}

class MainC {
	public static void main(String[] arg) {
		A0 a = x -> System.out.println("Hello " + x);
		a.fn(10);
		
		
		A0 b = x -> {
			System.out.println("Hello" + x);
			return;
		};
		b.fn(10);
	}
}