//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Rithvik Saravanan

import java.util.*;

import static java.lang.System.*;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet()
	{
	}

	public MathSet(String o, String t)
	{
		List<String> temp1 = new ArrayList<String>(Arrays.asList(o.split(" ")));
		List<Integer> list1 = new ArrayList<Integer>();
		List<String> temp2 = new ArrayList<String>(Arrays.asList(t.split(" ")));
		List<Integer> list2 = new ArrayList<Integer>();

		for (int i = 0; i < temp1.size(); i++) {
			list1.add(Integer.parseInt(temp1.get(i)));
		}
		for (int i = 0; i < temp2.size(); i++) {
			list2.add(Integer.parseInt(temp2.get(i)));
		}
		one = new TreeSet<Integer>(list1);
		two = new TreeSet<Integer>(list2);
	}

	public Set<Integer> union()
	{
		Set<Integer> union = new TreeSet<Integer>();
		union.addAll(one);
		union.addAll(two);
		return union;
	}

	public Set<Integer> intersection()
	{
		Set<Integer> intersection = new TreeSet<Integer>();
		intersection.addAll(one);
		intersection.retainAll(two);
		return intersection;
	}

	public Set<Integer> differenceAMinusB()
	{
		Set<Integer> diffAB = new TreeSet<Integer>();
		diffAB.addAll(one);
		diffAB.removeAll(two);
		return diffAB;
	}

	public Set<Integer> differenceBMinusA()
	{
		Set<Integer> diffBA = new TreeSet<Integer>();
		diffBA.addAll(two);
		diffBA.removeAll(one);
		return diffBA;
	}
	
	public Set<Integer> symmetricDifference()
	{		
		Set<Integer> symDiff = new TreeSet<Integer>();
		Set<Integer> temp = new TreeSet<Integer>();
		temp.addAll(one);
		temp.retainAll(two);
		symDiff.addAll(one);
		symDiff.addAll(two);
		symDiff.removeAll(temp);
		return symDiff;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" + "Set two " + two +  "\n";
	}
}