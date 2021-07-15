package first;

public class Student {

	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShortTermStudent shortTermStud = new ShortTermStudent();
		shortTermStud.setName("Lakshay");
		shortTermStud.setId(678);
		shortTermStud.setDuration(365);

		System.out.println(
				shortTermStud.getName() + " " + shortTermStud.getId() + " " + shortTermStud.getDuration() + " ");

		// long term students
		LongTermStudent longTermStud = new LongTermStudent();
		longTermStud.setName("Lakshay");
		longTermStud.setId(876);
		longTermStud.setCourse("Java");

		System.out.println(longTermStud.getName() + " " + longTermStud.getId() + " " + longTermStud.getCourse() + " ");

	}

}

class ShortTermStudent extends Student {
	private int duration;

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}

class LongTermStudent extends Student {
	private String course;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}