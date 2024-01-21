package GeoMetry;

public class Circle extends forAllObjects{

	double radius;
	
	
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