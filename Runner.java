import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;
public class Runner {
	public static void main(String[] args) {
		try {
			Scanner file = new Scanner(new File("words.txt"));
			Scanner scan = new Scanner(System.in);
			Crossword solver = new Crossword();
			int length, index;
			char letter;
			
			while(file.hasNext()) {
				solver.add(file.nextLine());
			}
			
			while(true) {
				solver.reset();
				System.out.print("Enter a length: ");
				length = scan.nextInt();
				solver.containsLength(length);
				
				System.out.print("Enter an index: ");
				index = scan.nextInt();
				System.out.print("Enter a letter: ");
				String temp = scan.next();
				scan.nextLine();
				letter = temp.charAt(0);
				solver.containsLetterAt(index, letter);
				System.out.println(solver);
			}
		} catch (FileNotFoundException e) {
			System.out.println("error");
		}
	}
}
