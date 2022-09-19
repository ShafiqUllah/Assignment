package SepSix;

public class Prog2_8 {
	
	static int min(int[] arrayOfInts) {
		int temp = 0;
		
		for(int i = 0 ; i < arrayOfInts.length; i++) {
			for(int j = i+1; j < arrayOfInts.length ; j++) {
				if (arrayOfInts[i] > arrayOfInts[j])   
                {  
                    temp = arrayOfInts[i];  
                    arrayOfInts[i] = arrayOfInts[j];  
                    arrayOfInts[j] = temp;  
                }  
			}
		}
		return arrayOfInts[0];
	}
	
	public static void main(String[] args) {
		int[] array = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		System.out.println(min(array));
	}
}
