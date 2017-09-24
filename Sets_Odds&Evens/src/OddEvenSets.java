//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Rithvik Saravanan

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenSets
{
	private Set<String> values;
	private Set<String> odds;
	private Set<String> evens;
	private Set<String> perfects;

	public OddEvenSets()
	{
	}

	public OddEvenSets(String line)
	{
		values = new TreeSet<String>(Arrays.asList((line.split(" "))));
	}

	public void sortSets()
	{
		odds = new TreeSet<String>();
		evens = new TreeSet<String>();
		perfects = new TreeSet<String>();

		for (String num : values) {
			int sum = 0;

			if (Integer.parseInt(num) % 2 == 0) {
				evens.add(num);
			} else if (Integer.parseInt(num) % 2 == 1) {
				odds.add(num);
			}
			for (int i = 1; i < Integer.parseInt(num); i++) {
				if (Integer.parseInt(num) % i == 0) {
					sum += i;
				}
			}
			if (sum == Integer.parseInt(num)) {
				perfects.add(num);
			}
		}
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\nPERFECTS : " + perfects + "\n\n";
	}
}