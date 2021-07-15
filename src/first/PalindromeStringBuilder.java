package first;

public class PalindromeStringBuilder {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("abc cba");
		StringBuilder s2 = new StringBuilder(s1);
		s1.reverse();
		System.out.println(s1);
		System.out.println(s2);
		if(s1.toString().equals(s2.toString())) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}
