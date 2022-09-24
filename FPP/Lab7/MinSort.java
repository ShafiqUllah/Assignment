package lab7;

import java.util.Arrays;

public class MinSort {
	char[] arr;

	public String sort(String st) {
		arr = new char[st.length()];
		for (int i = 0; i < st.length(); i++) {
			arr[i] = st.charAt(i);
		}

		if (arr == null || arr.length <= 1)
			return Arrays.toString(this.arr);
		int len = arr.length;

		return minpos(0, len - 1);
	}

	void swap(int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	// find minimum of arr between the indices bottom and top
	public String minpos(int bottom, int top) {

		if (bottom == top)
			return "" + arr[bottom];
		char m = arr[bottom];
		int index = bottom;
		for (int i = bottom + 1; i <= top; ++i) {
			if (arr[i] - (m) < 0) {
				m = arr[i];
				index = i;
			}
		}
		swap(bottom, index);
		// return location of min, not the min itself
		return "" + arr[bottom] + minpos(bottom + 1, top);
	}

	public static void main(String[] args) {
		MinSort ms = new MinSort();
		String result = ms.sort("zwxuabfkafutbbbb");
		System.out.println(result);

	}
}