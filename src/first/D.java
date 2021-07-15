package first;

class A5{  //javac generates A.class
	public void outerPrint() {
		System.out.println("I am inside Class A");
	}
	
	public static class B{  //javac generates A$B.class
		public static void print() {
			System.out.println("I am inside Class A.B");
		}
	}
	
}
public class D { //java MainApp -> run -> MainApp.main(String[]);
	
	public static void main(String[] args) {
		A5 a=new A5();
		a.outerPrint();
		A5.B.print();
	}

}