package second;

import java.util.*;

public class ExerciseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "import java.util.*;" + "class JavaExample{" + "public static void main(String args[]){"
				+ "ArrayList<String> alist=new ArrayList<String>();" + "alist.add('Gregor Clegane');"
				+ "alist.add('Khal Drogo');" + "//iterating ArrayList" + "for(String str:alist)"
				+ "System.out.println(str);" + "}" + "}";

		Stack s1 = new Stack();
		Stack s2 = new Stack();
		Stack s3 = new Stack();
		Stack s4 = new Stack();
		Stack s5 = new Stack();
		Stack s6 = new Stack();

		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {

			case '{':
				s1.push(str.charAt(i));
				break;
			case '}':
				s2.push(str.charAt(i));
				break;
			case '(':
				s3.push(str.charAt(i));
				break;
			case ')':
				s4.push(str.charAt(i));
				break;
			case '[':
				s5.push(str.charAt(i));
				break;
			case ']':
				s6.push(str.charAt(i));
				break;
			default:
				break;

			}
		}

		if (s1.size() == s2.size() && s2.size() == s3.size() && s3.size() == s4.size() && s4.size() == s5.size()
				&& s5.size() == s6.size()) {
			System.out.println("All stacks are of same size");
		}

		System.out.println("Stacks are unequal");

	}

}
