package SepSix;

import java.util.Arrays;

public class Prog6 {
	
	public static String[] removeDups(String[] arr) {
		
		String[] temp = new String[arr.length];
		int count = 0;
		
		
		for(int i = 0 ; i< arr.length; i++) {
			for(int j = i+1 ; j< arr.length; j++ ) {
				if(arr[i].compareTo(arr[j])== 0){
					arr[j]= "-1";
				}
			}
		}
		
		for(int i = 0 ; i< arr.length; i++) {
			if(arr[i].compareTo("-1") != 0) {
				temp[count++]= arr[i];
			}
		}
		
		//["horse","dog","cat"]
		
		//String[] b = Arrays.to
		
		
		System.out.print("[");
		for(int i = 0 ; i< arr.length; i++) {
			if(temp[i]!=null) {
				if(i != 0)
					System.out.print(",");
				System.out.print("\""+temp[i]+"\"");
			}
		}
		System.out.print("]");
		
		
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] input = {"horse", "dog", "cat", "horse","dog","cow","dog"};
		removeDups(input);

	}

}
