package GeoMetry;

public class forAllObjects {

	double xValue;
	double yValue;
	
	
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
	
	
	double getArea(double xValue, double yValue) {
		double area=xValue*yValue;
		return area;
	}
}