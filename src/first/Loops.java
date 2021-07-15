package first;

class WhileDemo {
public void main(){
int count = 1;

while (count < 11) {
System.out.println("Count is: " + count); count++;
}
}
}
class DoWhileDemo {
        public void main(){
int count = 1;
do { System.out.println("Count is: " + count); count++; } while (count <=11);
}
}


public class Loops {

	public static void main(String[] args) {
		DoWhileDemo d = new DoWhileDemo();
		d.main();
		
		
		WhileDemo di = new WhileDemo();
		di.main();

	}

}
