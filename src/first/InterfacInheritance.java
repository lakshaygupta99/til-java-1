package first;

interface Printable3{  
void print();  
}  
interface Showable3 extends Printable3{  
void show();  
}  
public class InterfacInheritance implements Showable3{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
public static void main(String args[]){  
	InterfacInheritance obj = new InterfacInheritance();  
obj.print();  
obj.show();  
 }  
}