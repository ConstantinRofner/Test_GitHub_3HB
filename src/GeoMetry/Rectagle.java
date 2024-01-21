package GeoMetry;

public class Rectagle {

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
	
	
	double getCircumference(double lentgh, double heigth) {
		double circumference=length*2+heigth*2;
		return circumference;
	}
}