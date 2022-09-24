package lab10;

import java.util.Objects;

public class Rational {

	int p, q;

	public Rational(int p, int q) {
		super();

		this.p = p;
		this.q = q;
		if (q < 0) {
			System.out.println("Denominator can't be negative");
			this.q = 1;
			return;
		}
		
		//System.out.print(toString());
		//System.out.print(" ");
		
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public int getQ() {
		return q;
	}

	public void setQ(int q) {
		this.q = q;
	}

	// adds the rational rat to this Rational
	public Rational add(Rational rat) {
		//System.out.println(" + ");
		int tempP = (rat.p * this.q) + (this.p * rat.q);
		int tempQ = rat.q * this.q;
		return new Rational(tempP, tempQ);
	}

	// multiplies rat by this Rational
	public Rational multiply(Rational rat) {
		//System.out.println(" * ");
		int tempP = rat.p * this.p;
		int tempQ = rat.q * this.q;
		return new Rational(tempP, tempQ);
	}

	// returns –1 if this rational is less than rat
	// returns 0 if this rational equals (see equals
	// method discussion below) rat
	// returns 1 if this rational is greater than rat
	public int compareTo(Rational rat) {
		if ((rat.p / rat.q) == (this.p / this.q)) {
			//System.out.println(" is equal to ");
			return 0;
		}else if((rat.p / rat.q) < (this.p / this.q)) {
			//System.out.println(" is greater than ");
			return 1;
		}else {
			//System.out.println(" is smaller than ");
			return -1;
		}
		
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(p, q);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rational other = (Rational) obj;
		return p == other.p && q == other.q;
	}

	@Override
	public String toString() {
		return p + "/" + q;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rational r1 = new Rational(2, 3).multiply(new Rational(-17, 5)).add(new Rational(1, 3));
		Rational r2 = new Rational(2, 3).multiply(new Rational(-17, 5).add(new Rational(1, 3)));

		int res = r1.compareTo(r2);
		if (res > 0) {
			System.out.println("(2/3 * -17/5) + 1/3 is greater than 2/3 * (-17/5 + 1/3)");
		} else if (res < 0) {
			System.out.println("(2/3 * -17/5) + 1/3 is smaller than 2/3 * (-17/5 + 1/3)");
		} else {
			System.out.println("(2/3 * -17/5) + 1/3 is equal to 2/3 * (-17/5 + 1/3)");
		}

	}

}
