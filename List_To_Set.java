package list_Interface;

import java.util.ArrayList;
import java.util.HashSet;

public class List_To_Set {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Avinash");
		al.add("Ammalu");
		al.add("Vikram");
		al.add("Gowtham");
		HashSet<String> hset = new HashSet<String>(al);
		for (String s : hset)
			System.out.println(s);
	}

}
/**
 * OUTPUT
 * Avinash
 * Ammalu
 * Vikram
 * Gowtham
 */
