package model;

public abstract class Operation {

	private double x;
	private double y;

	public abstract double calculate(double x, double y);

	public Operation() {
		super();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}
