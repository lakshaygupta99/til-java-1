package second;

//Generic
class ABC<T, U> {
	private T obj1;
	private U obj2;

	public ABC(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public T getT() {
		return obj1;
	}

	public U getU() {
		return obj2;
	}
}

public class Prj1Class {

	public static void main(String[] args) {
		ABC<String, Integer> ab = new ABC<String, Integer>("Hello", 34);
		System.out.println(ab.getT());
		System.out.println(ab.getU());

	}

}
