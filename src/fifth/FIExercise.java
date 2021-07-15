package fifth;

import java.util.function.Function;

public class FIExercise {
	int fn(String x) {
		return x.length();
	}
	
	static void fun(Function<String, Integer> f, String s) {
		System.out.println(f.apply(s));
	}
public static void main(String [] args) {
	
	Function<String, Integer> fi = new FIExercise()::fn;
	fun(fi, "Lakshay");
	
}
}
