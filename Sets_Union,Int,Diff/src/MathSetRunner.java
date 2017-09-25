//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Rithvik Saravanan

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MathSetRunner
{
	public static void main(String args[]) throws IOException
	{
		Scanner scanner = new Scanner(new File("C:\\Users\\Flash Station\\IdeaProjects\\Sets_Union,Int,Diff\\src\\mathsetdata.dat"));

		while(scanner.hasNextLine()) {
			String temp = scanner.nextLine();
			MathSet test;
			if (scanner.hasNextLine()) {
				String temp1 = scanner.nextLine();
				test = new MathSet(temp, temp1);
				System.out.println(test.toString() + "\nunion - " + test.union() + "\nintersection - " + test.intersection() + "\ndifference A-B - " + test.differenceAMinusB() + "\ndifference B-A - " + test.differenceBMinusA() + "\nsymmetric difference - " + test.symmetricDifference() + "\n\n");
			}
		}
	}
}
