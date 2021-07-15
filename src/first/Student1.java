package first;

public class Student1 {
	int rollno;
	static String college = "ITS";

	static void change() {
		college = "BBDIT";
	}

	Student1(int r) {
		rollno = r;
	}

	void display() {
		System.out.println(rollno + " " + college);
	}

	public static void main(String args[]) {
		Student1 s1 = new Student1(111);
		Student1 s2 = new Student1(222);
		s1.display(); // 111 ITS
		Student1.change();
		s1.display(); // 111 BBDIT
		s2.display(); // 222 BBDIT
	}
}