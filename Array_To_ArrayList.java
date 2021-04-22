package list_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_To_ArrayList {
	public static void main(String args[]) {

		ArrayList<String> al = new ArrayList<>();
		al.add("Avinash");
		al.add("Ammalu");
		al.add("Vikram");
		al.add("Gowtham");

		Object[] obj = al.toArray();

		for (Object obj1 : obj)
			System.out.println(obj1 + " ");

		// Conversion of Array to ArrayList

		Integer a[] = { 1, 2, 3, 4 };
		List<Integer> ab=Arrays.asList(a);
		System.out.println(ab);
	}
}

/**
 * OUTPUT
 * 
 * Avinash
 * Ammalu
 * Vikram
 * Gowtham
 * 
 * [1,2,3,4]
 * 
 */