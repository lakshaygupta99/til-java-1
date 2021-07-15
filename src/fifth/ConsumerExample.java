package fifth;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String args[]) {
		Consumer<Integer> consumer = i -> System.out.print(" " + i);
		Consumer<Integer> consumerWithAndThen = consumer.andThen(i -> System.out.print("(printed " + i + ")"));
		List<Integer> integerList = Arrays.asList(1, 10, 200, 101, -10, 0);
		printList(integerList, consumerWithAndThen);
	}

	public static void printList(List<Integer> listOfIntegers, Consumer<Integer> consumer) {
		for (Integer integer : listOfIntegers) {
			consumer.accept(integer);
		}
	}
}