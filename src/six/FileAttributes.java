package six;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttributeView;

public class FileAttributes {
public static void main(String [] args) throws IOException {

	 Path sourcePath = Paths.get("/Lakshay/test.txt");
	System.out.println(Files.isExecutable(sourcePath));
	System.out.println(Files.isHidden(sourcePath));
	System.out.println(Files.isReadable(sourcePath));
	System.out.println(Files.isWritable(sourcePath));
}
	
}
