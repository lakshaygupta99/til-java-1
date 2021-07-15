package first;

class Mammals {
	public void hand_bones() {
		System.out.println("Does Something!");
	}
}

class Humans extends Mammals {
	public void hand_bones() {
		System.out.println("Does a lot of work!");
	}
}

class Bats extends Mammals {
	public void hand_bones() {
		System.out.println("Flying work!");
	}
}

class Framework{
	public void work(Mammals m) {
		m.hand_bones();
	}
}

public class Prj5Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Framework f  =new Framework();
		
		Mammals M1 = new Mammals();
		f.work(M1);
		
		
		
		Mammals m2 = new Humans();
		f.work(m2);
		
		
		Mammals m3 = new Bats();
		f.work(m3);
	}

}
