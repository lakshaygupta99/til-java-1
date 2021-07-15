package fourth;

import java.util.*;
import java.util.stream.Collectors;

public class ExerciseStream {


	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(2);
		list1.add(3);
		list1.add(3);
		// unique squares
		List<Integer> res1 = list1.stream().map(s -> s*s).distinct().collect(Collectors.toList());
		System.out.println(res1);
		
		
		
		//empty string count
		 List<String> list2 = new ArrayList<String>();
		 list2.add("Hello");
		 list2.add("");
		 list2.add("Java");
		 list2.add("");
		 
		 long count = list2.stream().filter(s -> s.length() == 0).count();
		 System.out.println(count);
		 
		 
		 //highest number and lowest
		 
		 List<Integer> list3  = Arrays.asList(1,2,3,4,5,6,3,4,44,5,6,4,44,65,87,98);
		 
		 
		 System.out.println("Highest: " +list3.stream().max(Integer::compare));
		 System.out.println("Lowest: " + list3.stream().min(Integer::compare));
		
		 
		 
		 //sum
		 List<Integer> list4  = Arrays.asList(1,2,3,4,5,6,3,4,44,5,6,4,44,65,87,98);
		 
		int sum = list4.stream().reduce(0, (a, b)->a+b);
		 System.out.println(sum);
		 
		 
		 //avg
		 int avg = sum/list4.size();
		 System.out.println(avg);
		 
		

	}

}
