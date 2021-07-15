package fourth;
interface G {
	public int fn(int x, int y);
}

class Helper{
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public int sub(int x, int y) {
		return x - y;
	}
	
	public int mul(int x, int y) {
		return x*y;
	}
	
	public int divide(int x, int y) {
		if(y!=0) return x/y;
		
		return 0;
	}
	
}
public class Exercise {
	static void api(G a) {
		System.out.println(a.fn(40, 20));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		G a = new Helper() :: add;
		G s = new Helper() :: sub;
		G m = new Helper() :: mul;
		G d = new Helper() :: divide;
		
		api(a);
		api(s);
		api(d);
		api(m);
		
	}

}
