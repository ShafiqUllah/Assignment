package lab11.prob3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		
		List<Integer> listOfInt = new ArrayList<>();
		listOfInt.add(4);
		listOfInt.add(5);
		
		
		List<Double> listOfDoube = new ArrayList<>();
		listOfDoube.add(5.5);
		listOfDoube.add(6.4);
		
		System.out.println(Solution.sum(listOfInt));
		System.out.println(Solution.sum(listOfDoube));

	}

	public static double sum(Collection<? extends Number> nums) {
		double s = 0.0;
		for (Number num : nums)
			s += num.doubleValue();
		return s;
	}
}
