package six;

import java.io.IOException;
import java.nio.file.*;
public class PathFileNIOCopy {
	 public static void main(String[] args) {
		 Path sourcePath = Paths.get("/Lakshay/test.txt");
		 Path destinationPath = Paths.get("/Lakshay/test-copy.txt");
		 try {
		     Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
		     System.out.println("Done");
		 } catch(Exception e) { }
    }	}