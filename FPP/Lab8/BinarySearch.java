package lab8;

public class BinarySearch {

	/**
	 * Returns true if x is found in arr; false o.w.
	 * 
	 * @param arr - an already sorted array of positive length
	 * @param x   - integer being searched for
	 */
	public static boolean search(String[] arr, String x) {
		if (arr == null || arr.length == 0)
			return false;
		return recSearch(arr, x, 0, arr.length - 1);
	}

	private static boolean recSearch(String[] arr, String x, int lower, int upper) {
		if (lower > upper)
			return false;
		int mid = (upper + lower) / 2;
		if (x.compareTo(arr[mid]) == 0)
			return true;
		if (x.compareTo(arr[mid]) < 0)
			return recSearch(arr, x, lower, mid - 1);
		else
			return recSearch(arr, x, mid + 1, upper);
	}

//	public static void main(String[] args) {
//		int[] test1 = { 1, 2, 3 };
//		System.out.println(search(test1, 1));
//		System.out.println(search(test1, 4));
//		int[] test2 = { 1 };
//		System.out.println(search(test2, 1));
//		System.out.println(search(test2, 4));
//	}
}
