package fourth;

interface A {
	String fn(String s);
}

interface B {
	int fn2(int x);
}

public class Main {

	public static void main(String[] ar) {
//		
//		System.out.println(new String("Java").toUpperCase()); //String object calls toUppercase() : non static function of arbitrary object
//		//signature: String toUpperCase(){}
//		System.out.println(Integer.numberOfTrailingZeros(1000)); //Integer calls numberOfTrailingZeros(): Static function of arbitrary object
//		//signature: static int numberOfTrailingZeros(int){}

		A a = String::toUpperCase;
		B b = Integer::numberOfTrailingZeros;

		System.out.println(a.fn("Java"));

		System.out.println(b.fn2(100));

	}
}
