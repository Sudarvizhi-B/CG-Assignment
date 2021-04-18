package lab10;

import java.io.*;

public class ReadsLine {

	public static void main(String[] args) throws IOException {
		String filename = "C:\\Users\\ELCOT\\Desktop\\Sudar.txt";
		
		int i;
		boolean wrong = true;
		while (wrong) {
			try {
				FileReader file = new FileReader(filename);
				LineNumberReader linereader = new LineNumberReader(file);

				while ((i = linereader.read()) != -1) {
					System.out.print("#" + (linereader.getLineNumber()+1));
					System.out.print("  "+ (char)i + linereader.readLine()+"\n");
				}

			}
			catch (FileNotFoundException e) {
				System.out.println("Cannot read a file");
			}
			wrong = false;
		}
	}
}