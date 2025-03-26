package studio7;

public class Fraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(5,7);
		Fraction f2 = new Fraction(6,4);

	}
	
	private int num;
	private int dem;
	
	public Fraction (int num, int dem) {
		this.num = num;
		this.dem = dem;
	}
	
	public int getNum() {
		return num;
	}
	
	public int getDem() {
		return dem;
	}
	
	public Fraction add(Fraction f1, Fraction f2) {
		return new Fraction((f1.getNum() * f2.getDem()) + (f2.getNum() * f1.getDem()), f1.getDem() * f2.getDem());
	}
	
	public Fraction multiply(Fraction f1, Fraction f2) {
		return new Fraction(f1.getNum() * f2.getNum(), f1.getDem() * f2.getDem());
	}
	
	public Fraction reciprocal() {
		num = this.getDem();
		dem = this.getNum();
		return new Fraction(num, dem);
	}
	
	public Fraction simplify() {
		if (this.num > this.dem) {
			if (this.num % this.dem == 0) {
				
			}
		}
		if (this.dem > this.num) {
			if (this.dem % this.num == 0) {
				
			}
		}
		else {
			return new Fraction(1,1);
		}
	}
	

}
