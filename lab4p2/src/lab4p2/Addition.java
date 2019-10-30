package lab4p2;

public class Addition {
	private double x;
	private double y;
	private Double sum;
	
	public void Addition() {
		x=0;
		y=0;
		sum=0.0;
	}
	//behavior methods
	public void addvar(double x, double y) {
		sum=x+y;
	}
	public double getsum() {
		return sum;
	}

}
