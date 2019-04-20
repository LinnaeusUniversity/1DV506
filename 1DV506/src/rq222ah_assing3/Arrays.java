package rq222ah_assing3;

public class Arrays {

	public static void main(String[] args) {
		int[] n = { 3, 4, 5, 6, 7 };
		System.out.println("Sum of my array is :" + sum(n));

		System.out.println("n = " + toString(n));

		System.out.println(toString(addN(n, 3)));
		printN(addN(n, 3));

		System.out.println(toString(reverse(n)));

		System.out.println(hasN(n, 4));

		int[] m = { 1, 1, 1, 4, 3, 2 };
		replaceAll(m, 1, 9);
		System.out.println(toString(m));

		System.out.println(toString(sort(m)));

		// start here
		int[] a1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] a2 = { 1, 2, 3, 4 };
		System.out.println(isLarger(a1, a2));

		int[] arr = { 1, 2, 3, 5, 3, 4, 5 };
		int[] sub = { 3, 4, 5 };

		System.out.println(hasSubsequence(arr, sub));
	}

	// *************************************************
	/**
	 * 1. int sum(int[] arr), adding all elements of the array arr and returning the
	 * sum.
	 */
	public static int sum(int[] arr) {
		int sumOf = 0;
		for (int i = 0; i < arr.length; i++) {
			sumOf = sumOf + arr[i];
		}
		return sumOf;
	}

	/**
	 * 2.String toString(int[] arr), creating a string containing a nice-looking
	 * print out of the content of the array. It should be possible to use it in the
	 * following way.
	 */
	public static String toString(int[] arr) {
		StringBuilder buf = new StringBuilder();
		buf.append("{");
		for (int i = 0; i < arr.length; i++) {
			buf.append(arr[i] + ",");
		}
		buf.append("}");
		buf.deleteCharAt(buf.length() - 2);
		return buf.toString();
	}

	/**
	 * 3. int[] addN(int[] arr, int n), creating and returning a new array, where n
	 * have been added to all elements in arr. Array arr should be left unchanged.
	 */
	public static int[] addN(int[] arr, int n) {
		int[] newArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[i] + n;
		}
		return newArray;
	}

	public static void printN(int[] newArray) {

		for (int i = 0; i < newArray.length; i++)
			System.out.print(newArray[i] + " ");
	}

	/**
	 * 4. int[] reverse(int[] arr), creating and returning a new array, consisting
	 * of all elements in arr in reverse order. Array arr should be left unchanged.
	 */
	public static int[] reverse(int[] arr) {
		int[] reversOrder = new int[arr.length];
		for (int i = 0, j = reversOrder.length - 1; i < arr.length; i++, j--) {
			reversOrder[j] = arr[i];
		}
		return reversOrder;
	}

	/**
	 * 5. boolean hasN(int[] arr, int n), returning true if n is contained in the
	 * array arr, false otherwise.
	 */
	public static boolean hasN(int[] arr, int n) {
		boolean hasN = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n)
				hasN = true;
		}
		return hasN;
	}

	/**
	 * 6. void replaceAll(int[] arr, int old, int nw), replacing all occurrences of
	 * old with nw in arr.
	 */
	public static void replaceAll(int[] arr, int old, int nw) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == old) {

				arr[i] = nw;

			}

		}

	}

	/**
	 * 7.Method int[] sort(int[] arr), returning a new sorted array (increasing
	 * order), containing the same set of integers as arr. Array arr should be left
	 * unchanged.
	 */
	public static int[] sort(int[] arr) {
		int[] arr2 = new int[arr.length];

		for (int i = 0; i < arr.length; i++)
			arr2[i] = arr[i];

		for (int i = 0; i < arr2.length; i++) {
			for (int x = i + 1; x < arr2.length; x++) {
				if (arr2[i] > arr2[x]) {
					int temp = arr2[i];
					arr2[i] = arr2[x];
					arr2[x] = temp;
				}
			}
		}
		return arr2;
	}

	/**
	 * 8. boolean hasSubsequence(int[] arr, int[] sub), returning true if the
	 * sequence sub is a subsequence of array arr, false otherwise. The case
	 * hasSubsequence({1,2,3,4,5}, {3,4,5}) should return true since {3,4,5} is a
	 * part of {1,2,3,4,5}. The case hasSubsequence({1,2,3,4,5}, {1,3,5}) should
	 * return false since the exact sequence of elements {1,3,5} cannot be found in
	 * {1,2,3,4,5}.
	 */
	public static boolean hasSubsequence(int[] arr, int[] sub) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (sub[index] == arr[i]) {
				index++;
				if (index == sub.length)
					return true;
			} else
				index = 0;

		}
		return false;
	}

	/**
	 * 9.boolean isLarger(int[] a1, int[] a2), returning true if array a1 is larger
	 * than a2. Starting from the head, we compare the two arrays element by
	 * element. As soon as we find an element that is larger than the corresponding
	 * element in the other array we stop and declare the array with the largest
	 * element as “larger”. If they have the same initial sequence of elements but
	 * one array contains more elements, than the longer array is larger. A few
	 * examples; {4,3} vs {1,2,3,4,5} ==> {4,3} is larger since 4 > 1 {1,2,3,4} vs
	 * {1,3,5} ==> {1,3,5} is larger since 3 > 2 {1,2,3,4} vs {1,2,3} ==> {1,2,3,4}
	 * is larger since the first array is longer
	 */

	public static boolean isLarger(int[] a1, int[] a2) {
		for (int i = 0; i < a1.length; i++) {
			if (i >= a2.length) {// this condition is for to check that the
				// first array length is greater than or equal to a2
				return true;
			}
			if (a1[i] == a2[i])
				continue;
			else if (a1[i] > a2[i])
				return true;
			break;
		}
		return false;
	}
}