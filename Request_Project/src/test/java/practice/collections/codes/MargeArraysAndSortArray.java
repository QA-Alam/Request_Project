package practice.collections.codes;

import java.util.Arrays;

public class MargeArraysAndSortArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };
		int b[] = { 9, 14, 11 };

		int res[] = new int[a.length + b.length];
		System.arraycopy(a, 0, res, 0, a.length);
		System.arraycopy(b, 0, res, a.length, b.length);
		Arrays.sort(res);
		System.out.println(Arrays.toString(res));
		
		

		int[] arrayA = new int[] { 12, 7, 18, 9, 37, 1, 21 };
		int[] arrayB = new int[] { 27, 8, 71, 9, 18 };
		int[] mergedArray = new int[arrayA.length + arrayB.length];

		int i = 0, j = 0, k = 0;

		while (i < arrayA.length) {
			mergedArray[k] = arrayA[i];
			i++;
			k++;
		}

		while (j < arrayB.length) {
			mergedArray[k] = arrayB[j];
			j++;
			k++;
		}

		Arrays.sort(mergedArray);

	//	System.out.println("Array A : " + Arrays.toString(arrayA));

	//	System.out.println("Array B : " + Arrays.toString(arrayB));

		System.out.println("Merged Array : " + Arrays.toString(mergedArray));
	}

	 // Create a functions 
	@SuppressWarnings("unused")
	private static int[] mergeArray(int[] arrayA, int[] arrayB) {

		int[] mergedArray = new int[arrayA.length + arrayB.length];

		int i = 0, j = 0, k = 0;

		while (i < arrayA.length) {
			mergedArray[k] = arrayA[i];
			i++;
			k++;
		}

		while (j < arrayB.length) {
			mergedArray[k] = arrayB[j];
			j++;
			k++;
		}

		Arrays.sort(mergedArray);

		return mergedArray;
	}
}