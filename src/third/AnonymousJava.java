package third;

interface Operation {
	public int operate(int x, int y);
}

public class AnonymousJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operation add = (x,y) -> x + y;

		Operation sub = (x,y) -> x - y;

		Operation divide = (x,y) -> {
			if(y!=0)
			return x / y;
			
			return 0;
		};

		Operation multiply = (x,y) -> x * y;

		System.out.println(add.operate(21, 43));
		System.out.println(sub.operate(21, 43));
		System.out.println(divide.operate(21, 43));
		System.out.println(multiply.operate(21, 43));

	}

}
