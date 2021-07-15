package first;

class Test6<T, U> {
    T obj1;  // An object of type T
    U obj2;  // An object of type U
     // constructor
    Test6(T obj1, U obj2)     {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
public void print()     {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
class Test3 {
    public static void main (String[] args)     {
        Test6 <String, Integer> obj = new Test6<String, Integer>("Java", 15);
         obj.print();
    }
}