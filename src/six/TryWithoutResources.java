package six;

import java.io.*;

public class TryWithoutResources {
	public static void main(String[] args) {
		try {
			String str;
			// opening file in read mode using BufferedReader stream
			BufferedReader br = new BufferedReader(new FileReader("C:\\Lakshay\\myfile.txt"));
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close(); // closing BufferedReader stream
		} catch (IOException ie) {
			System.out.println("exception");
		}
	}
}