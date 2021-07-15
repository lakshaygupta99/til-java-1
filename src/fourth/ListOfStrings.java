package fourth;

import java.util.*;
import java.util.stream.Collectors;

public class ListOfStrings {
public static void main(String [] args) {
	List<String> list = Arrays.asList("Hello", "JaVa", "PeOpLe");
	
	List<String> list2 = list.stream().map(String::toLowerCase).collect(Collectors.toList());
	System.out.println(list2);
	
}
}
