package fourth;
import java.util.*;
public class StreamExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("");
		list.add("Hello");
		list.add("Java");
		list.add("");
		
		
		
		long c = list.stream().filter(u -> u.length()==0).count();
		System.out.println("Empty Strings: " + c);

	}

}
