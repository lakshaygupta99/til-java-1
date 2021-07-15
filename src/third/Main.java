package third;

interface A1 {
	void fn();

	void fn2();
}

class Main {
	public static void main(String[] arg) {
		A1 b = new A1() { // class Main$1 implements A
			public void fn() {
				System.out.println("Hello");
			}

			public void fn2() {
				System.out.println("Hello2");
			}

		};

		b.fn();
	}
}
