package SepNine.Prob3;

import java.util.Arrays;
import java.util.Objects;

public class AccountList {
	private final int INITIAL_LENGTH = 2;
	private Account[] accArray;

	private int size;

	public AccountList() {
		accArray = new Account[INITIAL_LENGTH];
		size = 0;
	}

	public void add(Account acc) {
		// implement
		if (accArray.length == size) {
			// increase array size
			resize();
			Account[] tempAccArray = new Account[accArray.length + INITIAL_LENGTH];
			System.arraycopy(accArray, 0, tempAccArray, 0, accArray.length);
			tempAccArray[accArray.length] = acc;
			accArray = tempAccArray;
			size++;
		} else {
			accArray[size++] = acc;
		}

	}

	public Account get(int i) {
		// implement
		if (i >= accArray.length)
			return null;
		else {
			return accArray[i];
		}
	}

	public boolean find(Account acc) {
		// implement

		for (int i = 0; i < accArray.length; i++) {
			if (acc.equals(accArray[i]) == true) {
				return true;
			}
		}
		return false;
	}

	public void insert(Account acc, int pos) {
		// implement
		if (pos >= accArray.length || pos < 0) {
			System.out.println("This position is out of index");
		} else {
			accArray[pos] = acc;
		}

	}

	public boolean remove(Account acc) {
		// implement
		if(size == 0) {
			return false;
		}
			
		Account[] tempAccArr = new Account[accArray.length - 1];
		int index = -1;
		for (int i = 0; i < accArray.length; i++) {
			if (acc.equals(accArray[i]) == true) {
				index = i;
				break;
			}
		}

		if (index != -1) {
			System.arraycopy(accArray, 0, tempAccArr, 0, index);
			if (index < accArray.length )
				System.arraycopy(accArray, index + 1, tempAccArr, index, accArray.length - index - 1);
			
			accArray = tempAccArr;
			size--;
			return true;
		} else {
			return false;
		}

	}

	private void resize() {
		//System.out.println("Resizing...");
		// implement
	}

	public String toString() {
		// implement
		return Arrays.toString( Arrays.stream(accArray).filter(Objects::nonNull).toArray());
	}

	public int size() {
		return size;
	}

	/*
	public static void main(String[] args) {
		AccountList l = new AccountList();
		l.add(new Account(new Employee("Bal1", 2020, 10, 21), 1000));
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.add(new Account(new Employee("Bal2", 2020, 10, 21), 1000));
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.add(new Account(new Employee("Bal3", 2020, 10, 21), 1000));
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.add(new Account(new Employee("Bal4", 2020, 10, 21), 1000));
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.add(new Account(new Employee("Bal5", 2020, 10, 21), 1000));
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.remove(new Account(new Employee("Bal6", 2020, 10, 21), 1000));
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.remove(new Account(new Employee("Bal7", 2020, 10, 21), 1000));
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		
		
		
		l.add(new Account(new Employee("Bal8", 2020, 10, 21), 1000));
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.insert(new Account(new Employee("Troye", 2010, 1, 5), 5000), 0);
		System.out.println("The list of size " + l.size() + " is " + l.toString());
	}
	
	*/

}
