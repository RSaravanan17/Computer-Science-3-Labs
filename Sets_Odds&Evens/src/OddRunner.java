//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Rithvik Saravanan

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class OddRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner scanner = new Scanner(new File("C:\\Users\\Flash Station\\IdeaProjects\\Sets_Odds&Evens\\src\\oddevent.dat"));

		while (scanner.hasNextLine()) {
			OddEvenSets test = new OddEvenSets(scanner.nextLine());
			test.sortSets();
			System.out.print(test.toString());
		}
	}
}