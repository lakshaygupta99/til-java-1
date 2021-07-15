package fourth;

import java.util.stream.*;

class A36 {
	public static void fn(String s) {
		s = "Hello " + s;
		System.out.println(s);
	}
}

public class MainK {
	public static void main(String args[]) {
		Stream<String> words = Stream.of("lower", "case", "text", "Java", "Prg");
		long c = words.peek(A36::fn).map(String::toUpperCase).peek(System.out::println).count();
		System.out.println("The number of Elements : " + c);
	}
}