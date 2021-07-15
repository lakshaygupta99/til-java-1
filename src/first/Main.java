package first;

public class Main {
	  public static void main(String[] args)
	  {
	      System.out.println("Hello");
	      for(int count = 1; count < 11; count++){
	          if (count==7)
	                break;
	          if(count==5)
	                continue;
	         System.out.println("Count is: " + count);
	      }
	  }
	}