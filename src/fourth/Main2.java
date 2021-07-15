package fourth;

import java.util.*;
import java.util.stream.Collectors;

public class Main2 {
	public static void main(String[] args) {
		System.out.println("The stream after applying the function is : ");
		List<String> list = Arrays.asList("java", "world", "j", "a", "v", "a");
		// Using Stream map(Function mapper) to convert the Strings in stream to
		// UpperCase form
		List<String> li = list.stream().map(String::toUpperCase).distinct().collect(Collectors.toList());
		System.out.println(li);
	}
}
