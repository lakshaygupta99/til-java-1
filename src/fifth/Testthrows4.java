package fifth;

import java.io.*;

class M4 {
	void method() throws IOException {
		throw new IOException("device error");
	}
}

class Testthrows4 {
	public static void main(String args[]) throws IOException {// declare exception
		M4 m = new M4();
		m.method();

		System.out.println("normal flow...");
	}
}