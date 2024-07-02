import java.util.*;

public class lists {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>(); // Initialize a new ArrayList

		for (int i = 0; i < 5; i ++) {
			arr.add(i); // Add elements to the end of an ArrayList in O(1) time
		}

		// Iterating through an ArrayList
		for (int i = 0; i < arr.size(); i++) { // Size gets an ArrayList's size
			System.out.println(arr.get(i)); // get will get the element at index i in the ArrayList
		}

		arr.remove(0); // Use remove to delete the element at the index specified from the ArrayList in O(n) time

		// Iterating through an ArrayList with a for-each loop, you can do this with other collections
		for (int i: arr) {
			System.out.println(i);
		}


		Pair<Integer, Integer> p = new Pair<>(5, 6);
		p.first += 1;
		System.out.println(p.first + " " + p.second);
	}
}

class Pair<K, V> {
	K first;
	V second;

	public Pair(K first, V second) {
		this.first = first;
		this.second = second;
	}
}
