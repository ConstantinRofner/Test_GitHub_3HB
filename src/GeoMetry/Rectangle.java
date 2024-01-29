package GeoMetry;

public class Rectangle extends Shape{

	private double length;
	private double height;
	
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
	@Override
	public double getCircumference() {
		double circumference=length*2+height*2;
		return circumference;
	}
	
	/**
	 * calculates the area of the rectangle
	 * @param length
	 * @param heigth
	 * @return
	 */
	@Override
	public double getArea() {
		double area=length*height;
		return area;
	}

	public String toString() {
		return "Länge des Rechtecks: " + this.length + "\nHöhe des Rechtecks: " + this.height;
	}
}