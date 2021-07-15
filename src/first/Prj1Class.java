package first;
public class Prj1Class {
	

	
	public int add(int a, int b) {
		return a + b;
	}
	
	
	 public int Prj1Class() {
	System.out.println("Default constructor");
	return 0;
	}
	
	
	
	public static void main(String[] args) {
	Prj1Class myObj = new Prj1Class();
	myObj.Prj1Class();
	//System.out.println(myObj.add(34, 56));
	}
}