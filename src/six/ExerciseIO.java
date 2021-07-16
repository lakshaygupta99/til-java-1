package six;

import java.io.*;
import java.util.*;

public class ExerciseIO {

	public static void main(String [] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		File file = new File("/Lakshay/Name_Collections.txt");
		file.createNewFile();
		
		FileWriter writer = new FileWriter(file, true);
		writer.write(name + " " + "Login Time: " + System.currentTimeMillis() + "\n");
		writer.flush();
		writer.close();
			
		System.out.println("Hello " + name);
	}
}
