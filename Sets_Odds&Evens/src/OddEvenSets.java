//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Rithvik Saravanan

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenSets
{
	private Set<Integer> values;
	private Set<Integer> odds;
	private Set<Integer> evens;
	private Set<Integer> perfects;

	public OddEvenSets()
	{
	}

	public OddEvenSets(String line)
	{
		odds = new TreeSet<Integer>();
		evens = new TreeSet<Integer>();
		perfects = new TreeSet<Integer>();
		List<String> temp = new ArrayList<String>(Arrays.asList(line.split(" ")));
		List<Integer> temp1 = new ArrayList<Integer>();
		for (int i = 0; i < temp.size(); i++) {
			temp1.add(Integer.parseInt(temp.get(i)));
		}
		values = new TreeSet<Integer>(temp1);
	}

	public void sortSets()
	{
		for (int num : values) {
			int sum = 0;

			if (num % 2 == 0) {
				evens.add(num);
			} else if (num % 2 == 1) {
				odds.add(num);
			}
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					sum += i;
				}
			}
			if (sum == num) {
				perfects.add(num);
			}
		}
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\nPERFECTS : " + perfects + "\n\n";
	}
}