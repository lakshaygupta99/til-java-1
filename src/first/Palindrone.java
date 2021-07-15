package first;

public class Palindrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String("abc cba");
		int j = s.length() - 1;
		
		int i = 0;
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) {
			System.out.println("Not Palindrome!");	
			return;
			}
			i++;
			j--;
		}
		System.out.println("Palindrome");
		

	}

}
