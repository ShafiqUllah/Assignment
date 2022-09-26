package lab11;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Schur {

	public boolean checkForSum(List<Integer> list, Integer z) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (Integer i : list) {
			map.put(i, i);
		}

		// Integer nextFindValue = z - 1;

		for (Integer i : map.values()) {
			if (map.containsValue(z - i)) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> data = new LinkedList<>();
		//Range of value is 1 ~ 100
		for (int i = 1; i <= 100; i++)
			data.add(i);
		
		if(new Schur().checkForSum(data, 50)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}

	}

}
