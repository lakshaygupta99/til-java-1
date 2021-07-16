package six;

import java.io.*;

class TryWithResources {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Lakshay\\myfile.txt"))) {
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
				throw new IOException("Error");
			}
		} catch (IOException ie) {
			System.out.println("exception");
		}
	}
}