package fourth;

import java.util.*;
import java.util.stream.*;

public class MainLAzy {
	public static void main(String args[]) {
		List<String> list = Arrays.asList("1", "2", "5", "great", "9", "2");
		String str = list.stream().filter(s -> !s.startsWith("n")).peek(s -> System.out.println("Peek 1 " + s + " "))
				.map(String::toUpperCase).peek(System.out::println).map(x -> Integer.parseInt(x))
				.map(ss -> ss.toString()).collect(Collectors.joining(", "));
		System.out.println(str);

	}
}