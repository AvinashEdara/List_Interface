package list_Interface;

import java.util.ArrayList;

public class Basic_Methods {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Avinash");
		al.add("Ammalu");
		al.add("Vikram");
		al.add("Gowtham");

		ArrayList<String> b = new ArrayList<>();
		b.add("Dhaval");
		b.add("Nidhi");
		b.add("Badal");
		b.add("Amit");

		// Basic Operations of CollectionFramework
		al.addAll(b);
		System.out.println("---addAll---");
		System.out.println(al);
		System.out.println("---addAllExit---");

		System.out.println("---contains()---");
		System.out.println(b.contains("Dhaval"));
		System.out.println("---contains()Exit---");

		System.out.println("---containsAll()---");
		System.out.println(al.containsAll(b));
		System.out.println("---containsAll()Exit---");

		System.out.println("---size()---");
		System.out.println("Size of arraylist b is " + b.size());
		System.out.println("---size()Exit---");

		System.out.println("---remove()---");
		System.out.println("After removing Amit " + b.remove("Amit"));
		System.out.println("After removing Badal " + b.remove(2));
		System.out.println("---remove()Exit---");

		System.out.println("---removeAll()---");
		System.out.println(al.removeAll(b));
		System.out.println(al);
		System.out.println("---removeAll()Exit---");
	}
}

/**
 * OUTPUT
 * 
 * ADD ALL ()
 * [Avinash, Ammalu, Vikram, Gowtham, Dhaval, Nidhi, Badal, Amit]
 * 
 * CONTAINS()
 * true
 * 
 * CONTAINSALL()
 * true
 * 
 * SIZE()
 * 4
 * 
 * REMOVE()
 * 
 * After removing Amit true
 * After removing Badal Badal
 * 
 * REMOVEALL()
 * true
 * [Avinash, Ammalu, Vikram, Gowtham, Badal, Amit]
 */

