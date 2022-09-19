package SepNine.Prob3;

import java.util.Arrays;
import java.util.Objects;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray;
	private String[] temp;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	public void add(String s) {
		// implement
		if (strArray.length == size) {
			// increase array size
			resize();
			System.arraycopy(strArray, 0, temp, 0, strArray.length);
			temp[strArray.length] = s;
			strArray = temp;
			size++;
		} else {
			strArray[size++] = s;
		}

		//System.out.println(Arrays.toString(strArray));
	}

	public String get(int i) {
		// implement
		if (i >= strArray.length)
			return null;
		else {
			return strArray[i];
		}
	}

	public boolean find(String s) {
		// implement

		for (int i = 0; i < strArray.length; i++) {
			if (s.compareTo(strArray[i]) == 0) {
				return true;
			}
		}
		return false;
	}

	public void insert(String s, int pos) {
		// implement
		if (pos >= strArray.length || pos < 0) {
			System.out.println("This position is out of index");
		} else {
			strArray[pos] = s;
		}

	}

	public boolean remove(String s) {
		// implement
		if(size == 0) {
			return false;
		}
			
		String[] tempArr = new String[strArray.length - 1];
		int index = -1;
		for (int i = 0; i < strArray.length; i++) {
			if (s.compareTo(strArray[i]) == 0) {
				index = i;
				break;
			}
		}

		if (index != -1) {
			System.arraycopy(strArray, 0, tempArr, 0, index);
			//System.out.println(Arrays.toString(tempArr));
			if (index < strArray.length )
				System.arraycopy(strArray, index + 1, tempArr, index, strArray.length - index - 1);
			
			strArray = tempArr;
			size--;
			//System.out.println(Arrays.toString(tempArr));
			return true;
		} else {
			return false;
		}

	}

	private void resize() {
		//System.out.println("Resizing...");
		temp = new String[strArray.length + INITIAL_LENGTH];
		// implement
	}

	public String toString() {
		// implement
		return Arrays.toString( Arrays.stream(strArray).filter(Objects::nonNull).toArray());
	}
	
	public String[] toStringArray() {
		// implement
		return strArray;
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		MyStringList l = new MyStringList();
		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		
		
		l.remove("Susan");
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.remove("Steve");
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.remove("Dave");
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.add("Shafiq");
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.insert("Troye", 0);
		System.out.println("The list of size " + l.size() + " is " + l.toString());
	}

}
