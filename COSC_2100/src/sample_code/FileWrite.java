package sample_code;

import java.io.*;
import java.io.IOException;

/**
 * A program to write contents to a file
 * @author Dr. Jain *
 */
public class FileWrite {
	public static void main(String[] args) throws IOException {
		FileWriter fw1 = new FileWriter("info2.txt", true);
		//added true to work in "append" mode
		PrintWriter pw1 = new PrintWriter(fw1);
		
		pw1.println("5th run");
		pw1.println("Bye ");
		pw1.println("See you soon!!");
		
		pw1.println("Next class on Wednesday!!");
		pw1.println("prince");
		
		pw1.close();

	}

}
