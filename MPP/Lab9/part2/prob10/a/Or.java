package lab9.part2.prob10.a;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));

		Or m = new Or();
		System.out.println(m.someSimpleIsTrue(list));
	}
	
	public boolean someSimpleIsTrue(List<Simple> list) {
		return list.stream().reduce(false, (prev, cur) -> prev || cur.flag, (prev, cur) -> prev || cur);
//		boolean accum = false;
//		for(Simple s: list) {
//			accum = accum || s.flag;
//		}
//		return accum;
	}

}
