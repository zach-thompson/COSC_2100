package sample_code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * A program to read the contents of a file
 * @author Dr. Jain
 *
 */
public class FileRead {

	public static void main(String[] args) throws FileNotFoundException {
		File f1 = new File("infoo.txt");
		Scanner s1 = new Scanner(f1);
		while(s1.hasNextLine())
			System.out.println(s1.nextLine());
		s1.close();

		/* using try-catch, remove throws declaration
		 File f1 = new File("infoo.txt");
		 try{
			Scanner s1 = new Scanner(f1);
			while(s1.hasNextLine())
				System.out.println(s1.nextLine());
			s1.close();
			}
			catch(FleNotFoundException e){
				e.printStackTrace();
			}
		 */

	}
}

