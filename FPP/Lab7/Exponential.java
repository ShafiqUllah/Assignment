package lab7;

public class Exponential {
	
	public double power(double x,int n) {
		if(n == 0) return 1;
		
		return x * power(x, n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new Exponential().power(2, 10));

	}

}
