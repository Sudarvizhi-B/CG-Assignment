package lab10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Location of a file");
		String filename = sc.nextLine();

		File file = new File(filename);
		
		if(file.exists()==true) {
			System.out.println("File Exist..");
			if(file.canRead() == true) {
				System.out.println("Can read a file..");
			}
			else {
				System.out.println("Can't read a file..");
			}
			if(file.canWrite() == true) {
				System.out.println("Can Write a file..");
			}
			else {
				System.out.println("Can't write a file..");
			}
			System.out.println(file.length());
			System.out.println();
		}
		else {
			System.out.println("File not Exist...");
		}
	}

}
