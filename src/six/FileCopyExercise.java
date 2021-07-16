package six;

import java.io.*;

public class FileCopyExercise {

	public static void main(String[] args) {
		if (args.length != 1)
			System.err.println("Usage: java FileCopy <source file>");
		else {
			try {
				execute(args[0]);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}

	}

	public static void execute(String from_name) throws IOException {
		File from_file = new File(from_name);
		System.out.println(from_name);

		String extension = from_name.substring(from_name.lastIndexOf('.'), from_name.length());

		System.out.println(extension);
		if (!extension.equals(".java"))
			throw new IOException("File extension not allowed");
		String newPath = "";

		newPath += from_name.substring(0, from_name.lastIndexOf('.')) + ".clas";

		File to_file = new File(newPath);

		System.out.println(newPath);

		FileInputStream from = null;
		FileOutputStream to = null;
		try {
			from = new FileInputStream(from_file);
			to = new FileOutputStream(to_file);
			byte[] buffer = new byte[4096];
			int bytes_read;
			while ((bytes_read = from.read(buffer)) != -1)
				to.write(buffer, 0, bytes_read);
		} finally {
			if (from != null || to != null)
				try {
					from.close();
					to.close();
				} catch (IOException e) {
					;
				}
		}
	}

}
