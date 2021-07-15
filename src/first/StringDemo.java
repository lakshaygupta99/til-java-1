package first;

public class StringDemo {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java for sb=“Hello”
		sb.insert(1, "Java");// now original string is changed
		System.out.println(sb);// prints HJavaello for sb=“Hello”
		sb.replace(1, 3, "Java");
		System.out.println(sb);// prints HJavalo for sb=“Hello”
		sb.delete(1, 3);
		System.out.println(sb);// prints Hlo for sb=“Hello”
		sb.reverse();
		System.out.println(sb);// prints olleH for sb=“Hello”
		
		
		
		
		
		StringBuffer sb1=new StringBuffer("Hello");  
		sb1.append("Java");//now original string is changed  
		System.out.println(sb1);//prints Hello Java for sb=“Hello” 
		sb1.insert(1,"Java");//now original string is changed  
		System.out.println(sb1);//prints HJavaello for sb=“Hello”
		sb1.replace(1,3,"Java");  
		System.out.println(sb1);//prints HJavalo for sb=“Hello”
		sb1.delete(1,3);  
		System.out.println(sb1);//prints Hlo for sb=“Hello”
		sb1.reverse();  
		System.out.println(sb1);//prints olleH for sb=“Hello”
		 
	}
}