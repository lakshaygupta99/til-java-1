package fifth;

import java.io.*;

class M3 {
	void method() throws IOException {
		System.out.println("device operation performed");
	}
}

class Testthrows3 {
	public static void main(String args[]) throws IOException {// declare exception
		M3 m = new M3();
		m.method();

		System.out.println("normal flow...");
	}
}