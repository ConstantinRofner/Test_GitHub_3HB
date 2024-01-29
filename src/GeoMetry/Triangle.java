package GeoMetry;

public class Triangle extends Shape{

	private double lengthSiteA;
	private double lengthSiteB; 
	private double lengthSiteC;
	private double triangleHeight;
	
	public Triangle(double xValue, double yValue,
			double lengthSiteA, double lengthSiteB, double lengthSiteC, double triangleHeight) {
		super(xValue, yValue);
		this.lengthSiteA = lengthSiteA;
		this.lengthSiteB = lengthSiteB;
		this.lengthSiteC = lengthSiteC;
		this.triangleHeight = triangleHeight;
	}
	
	public double getLengthSiteA() {
		return lengthSiteA;
	}
	public void setLengthSiteA(double lengthSiteA) {
		this.lengthSiteA = lengthSiteA;
	}
	public double getLengthSiteB() {
		return lengthSiteB;
	}
	public void setLengthSiteB(double lengthSiteB) {
		this.lengthSiteB = lengthSiteB;
	}
	public double getLengthSiteC() {
		return lengthSiteC;
	}
	public void setLengthSiteC(double lengthSiteC) {
		this.lengthSiteC = lengthSiteC;
	}
	public double getTriangleHeight() {
		return triangleHeight;
	}
	public void setTriangleHeight(double triangleHeight) {
		this.triangleHeight = triangleHeight;
	}
	
	/**
	 * calculates the circumference of the triangle
	 * @param lengthSiteA
	 * @param lengthSiteB
	 * @param lengthSiteC
	 * @return
	 */
	@Override
	public double getCircumference() {
		double circumference=lengthSiteA+lengthSiteC+lengthSiteC;
		return circumference;
	}
	
	/**
	 * calculates the area of the triangle
	 * @param lengthSiteC
	 * @param triangleHeight
	 * @return
	 */
	@Override
	public double getArea() {
		double area=(lengthSiteC * triangleHeight)/2;
		return area;
	}

	public String toString() {
		return "Länge A-Seite des Dreiecks: " + this.lengthSiteA + 
				"\nLänge B-Seite der Form: " + this.lengthSiteB +
				"\nLänge C-Seite der Form: " + this.lengthSiteC +
				"\nHöhe des Dreiecks: " + this.triangleHeight;
	}
}