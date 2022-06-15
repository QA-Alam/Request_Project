package practice.collections.codes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/*
Remove duplicates by sorting an array
*/
public class RemoveDuplicate {

	// Remove duplicate number from array without any method
	public static void mains(String[] args) {

		int arr[] = { 5, 1, 2, 6, 4, 4, 5, 6, 8, 7 };
		// removeDuplicateUsingSorting(arr);
		// Sort an unsorted array
		Arrays.sort(arr);

		int len = arr.length;
		int j = 0;

		// Traverse an array
		for (int i = 0; i < len - 1; i++) {

			// if value present at i and i+1 index is not equal
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}

		arr[j++] = arr[len - 1];

		for (int k = 0; k < j; k++) {
			System.out.print(arr[k] + " ");
		}
	}

	// Find out duplicate number from array without any method
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 3, 2 };
		int c = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("dup => " + a[i]);
					//c++;
				}
			} // for
		} // for1
		//System.out.println("dup => " + c);
	}
	// How to remove duplicate values
	public static void removeDuplicate() {
		List<Integer> remove = Arrays.asList(100, 200, 200, 300, 500, 700, 800);
		List<Integer> duplicate = remove.stream().distinct().collect(Collectors.toList());
		System.out.println("Only unic values : " + duplicate);

	}
	public void removeDuplicate1() {
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
		// First solution : finding duplicates using brute force method
		System.out.println("Finding duplicate elements in array using brute force method");
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) { // got the duplicate element
				}
			}
		}
	}

	public void removeDuplicate2() {
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
		// Second solution : use HashSet data structure to find duplicates
		System.out.println("Duplicate elements from array using HashSet data structure");
		Set<String> store = new HashSet<>();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("found a duplicate element in array : " + name);
			}
		}
	}

	public void removeDuplicate3() {
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
		// Third solution : using Hash table data structure to find duplicates
		System.out.println("Duplicate elements from array using hash table");
		Map<String, Integer> nameAndCount = new HashMap<>();
		// build hash table with count
		for (String name : names) {
			Integer count = nameAndCount.get(name);
			if (count == null) {
				nameAndCount.put(name, 1);
			} else {
				nameAndCount.put(name, ++count);
			}
		}
		// Print duplicate elements from array in Java
		Set<Entry<String, Integer>> entrySet = nameAndCount.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate element from array : " + entry.getKey());
			}
		}
	}
}
