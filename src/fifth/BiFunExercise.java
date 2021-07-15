package fifth;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiFunction<Integer, Integer, Integer> add = (x, y) -> (x + y);
		BiFunction<Integer, Integer, Integer> sub = (x, y) -> (x - y);
		BiFunction<Integer, Integer, Integer> mul = (x, y) -> (x * y);
		BiFunction<Integer, Integer, Integer> div = (x, y) -> {
			if (y != 0)
				return x / y;
			else
				return 0;

		};

	System.out.println(add.apply(21, 2));
	System.out.println(sub.apply(21, 2));
	System.out.println(mul.apply(21, 2));
	System.out.println(div.apply(20, 2));
	
	
	
	}

}
