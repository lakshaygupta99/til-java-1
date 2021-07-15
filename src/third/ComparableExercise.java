package third;

import java.util.*;

class Emp2 implements Comparable<Emp2> {
	String name;

	Emp2(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Emp2 o) {
		// TODO Auto-generated method stub
		return ((Integer)this.name.length()).compareTo((Integer)o.name.length());
	}

}

public class ComparableExercise {
	public static void main(String[] args) {
		List<Emp2> list = new ArrayList<Emp2>();

		list.add(new Emp2("LAkshay"));
		list.add(new Emp2("Monica"));
		list.add(new Emp2("John"));
		Collections.sort(list);
		for (Emp2 a : list)
			System.out.println(a.name);
	}

}
