package GeoMetry;

public class Circle extends forAllObjects{

	private double radius;
	
	public Circle() {
		super();
	}
	
	public Circle(double xValue, double yValue, 
			double radius) {
		super(xValue, yValue);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**
	 * calculates the circumference of the circle
	 * @param radius
	 * @return
	 */
	public double getCircumference(double radius) {
		double circumference=radius+2*3.14;
		return circumference;
	}
	
	/**
	 * calculates the area of the circle
	 * @param radius
	 * @return
	 */
	public double getArea(double radius) {
		double area=3.14*radius*radius;
		return area;
	}
}