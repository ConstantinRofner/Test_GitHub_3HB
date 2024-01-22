package GeoMetry;

public class Rectangle extends forAllObjects{

	private double length;
	private double height;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(double xValue, double yValue, 
			double length, double height) {
		super(xValue, yValue);
		this.length = length;
		this.height = height;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	/**
	 * calculates the circumference of the rectangle
	 * @param lentgh
	 * @param heigth
	 * @return
	 */
	public double getCircumference(double lentgh, double heigth) {
		double circumference=length*2+heigth*2;
		return circumference;
	}
	
	/**
	 * calculates the area of the rectangle
	 * @param length
	 * @param heigth
	 * @return
	 */
	public double getArea(double length, double heigth) {
		double area=length*height;
		return area;
	}
}