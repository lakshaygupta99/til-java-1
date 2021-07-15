package fourth;

import java.util.*;
import java.util.stream.Collectors;

public class MapExLEngth {
public static void main(String[]args) {
	List<String>list = Arrays.asList("Hello", "Java ", "People");
	
	List<String>list2 =	list.stream().map(s->((Integer)s.length()).toString()).collect(Collectors.toList());
	System.out.println(list2);
	
}
}
