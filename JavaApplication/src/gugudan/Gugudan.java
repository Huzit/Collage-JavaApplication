package gugudan;

public class Gugudan {
	private int n=5;

	public void gugudan() {
		
		for(int i=1; i<=9; i++) {
			System.out.println(n*i);
		}
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
}
