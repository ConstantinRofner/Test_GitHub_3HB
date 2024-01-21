package GeoMetry;

public class Rectagle extends forAllObjects{

	double length;
	double height;
	
	
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