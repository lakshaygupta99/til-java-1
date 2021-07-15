package fourth;

import java.util.stream.*;
import java.util.*;
import java.util.function.*;
class A3{
	public static void fn(String s) {
		s="Hello "+ s;
		System.out.println(s);
	}
}
public class Main5 {
   public static void main(String args[]) {
      Stream<String> words = Stream.of("lower", "case", "text");
List<String> list = words
    .peek(A3 :: fn)
    .map(s -> s.toUpperCase())
    .collect(Collectors.toList());
System.out.println(list);
   }
}