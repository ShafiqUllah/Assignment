package sortroutines;

import java.util.Arrays;

import runtime.Sorter;


public class BSTSort extends Sorter{
	MyBST myBST = new MyBST();
	// It takes as input an array and builds a BST tree from it.
	public void insertAll(int[] array){
		for(int i : array) {
			myBST.insert(Integer.valueOf(i));
			
		}
	}
	
	
	//It traverses the BST and returns all its elements in a sorted array
	public int[] readIntoArray() {
		return myBST.getAllValue();
	}
	

	@Override
	public int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		insertAll(arr);
		
		readIntoArray();
		//readIntoArray();
		return null;
	}
	
	public static void main(String[] args) {
		int[] data = {2,5,90,23,12,9,15};
		
		new BSTSort().sort(data);
	}

}
