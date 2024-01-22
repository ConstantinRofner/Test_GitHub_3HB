package GeoMetry;

public class Triangle extends forAllObjects{

	private double lengthSiteA;
	private double lengthSiteB; 
	private double lengthSiteC;
	private double triangleHeight;
	
	public Triangle() {
		super();
	}
	
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
	public double getCircumference(double lengthSiteA, double lengthSiteB, double lengthSiteC) {
		double circumference=lengthSiteA+lengthSiteC+lengthSiteC;
		return circumference;
	}
	
	/**
	 * calculates the area of the triangle
	 * @param lengthSiteC
	 * @param triangleHeight
	 * @return
	 */
	public double getArea(double lengthSiteC, double triangleHeight) {
		double area=(lengthSiteC * triangleHeight)/2;
		return area;
	}
}