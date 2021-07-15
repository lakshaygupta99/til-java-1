package fifth;

class WrongInputException extends Exception {
	WrongInputException(String s) {
		super(s);
	}
}

class Input {
	void method() throws WrongInputException {
		throw new WrongInputException("Wrong input");
	}
}

class Main8 {
	public static void main(String[] args) {
		try {
			Input n = new Input();
			n.method();
		} catch (WrongInputException wie) {
			System.out.println(wie.getMessage());
		}
	}
}