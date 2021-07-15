package fifth;

public class ExceptionExer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer input = 0;
		
		try {
			System.out.println("Successfull execution!!");
			System.out.println(100/input);
			System.out.println("After execution!!");
		}catch(Exception e) {
			System.out.println("Exception caught: " + e);
		}finally {
			System.out.println("Finally block!!");
		}
		
		
		

	}

}
