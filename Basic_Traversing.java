package list_Interface;

import java.util.ArrayList;
import java.util.Iterator;

public class Basic_Traversing {
	public static void main(String args[]) {

		ArrayList<String> al = new ArrayList<>();
		al.add("Avinash");
		al.add("Ammalu");
		al.add("Vikram");
		al.add("Gowtham");
		al.add("Dhaval");
		al.add("Nidhi");

		// using iterator
		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Using For Each loop");
		// using for-each loop
		for (String s : al) {
			System.out.println(s);
		}
		System.out.println("Normal");
		// normal
		System.out.println(al);
	}
}
/**
 * OUTPUT
 * 
 * USING ITERATOR
 * 
 * Avinash
 * Ammalu
 * Vikram
 * Gowtham
 * Dhaval
 * Nidhi
 * 
 * USING FOR-EACH LOOP
 * 
 * Avinash
 * Ammalu
 * Vikram
 * Gowtham
 * Dhaval
 * Nidhi
 * 
 * USING NORMAL PRINT STATEMENT
 * 
 * [Avinash, Ammalu, Vikram, Gowtham, Dhaval, Nidhi]
 */
