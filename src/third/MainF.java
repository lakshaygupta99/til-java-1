package third;

interface A5
{
	int fn(int x);
}
class B{
	int print(int x) {
		System.out.println("This is a printing process");
		return x*x;
	}
}
class C{
	int display(int x) {
		System.out.println("This is a displaying process");
		return x+x;
	}
}
public class MainF{
	static void fnn(A5 a) {
		System.out.println(a.fn(10));
	}
	public static void main(String[] ar) {
		A5 a1= x -> new B().print(x);
		
		A5 a2=new A5() {
			public int fn(int x) {
				return new C().display(x);
			}
		};
		
		A5 a3= new C() :: display;
		//fnn(a1); //
		//fnn(a2);
		
		fnn(a3); //
		fnn(a3);
	}
}
