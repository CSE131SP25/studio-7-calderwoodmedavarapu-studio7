package studio7;

public class Die {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die n = new Die(20);
		
		System.out.println(n.toss());
	}
	
	private int sides;
	
	public Die (int sides) {
		this.sides = sides;
	}
	
	public int toss() {
		int number = (int)(Math.random() * sides + 1);
		return number;
	}
}
