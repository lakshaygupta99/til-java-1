package six;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Lakshay\\test.txt");
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}