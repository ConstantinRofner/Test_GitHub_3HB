package GeoMetry;

public abstract class Shape {

	private double xValue;
	private double yValue;
	
	public Shape() {}
	
	public Shape(double xValue, double yValue) {
		super();
		this.xValue = xValue;
		this.yValue = yValue;
	}
	
	public double getxValue() {
		return xValue;
	}
	public void setxValue(double xValue) {
		this.xValue = xValue;
	}
	public double getyValue() {
		return yValue;
	}
	public void setyValue(double yValue) {
		this.yValue = yValue;
	}
	
	
	public String toString() {
		return "X-Koordinate der Form: " + this.xValue + "\n Y-Koordinate der Form: " + this.xValue;
	}

	public abstract double getCircumference();
	public abstract double getArea();
}