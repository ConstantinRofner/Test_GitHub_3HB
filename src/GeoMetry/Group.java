package GeoMetry;

import java.util.ArrayList;

public class Group {
	
    private ArrayList<Shape> objects;
    
	public Group() {
		this.objects = new ArrayList<Shape>();
	}
	
	public ArrayList<Shape> getObjects() {
		return objects;
	}
	public void setObjects(ArrayList<Shape> objects) {
		this.objects = objects;
	}
    
	/**
	 * Method adds an Object to Shape
	 * @param o
	 */
	public void addObject(Shape o) {
		this.objects.add(o);
	}
	
	/**
	 * Method removes an Object from Shape
	 * @param o
	 */
	public void deleteObject(Shape o) {
		objects.remove(o);
	}
	
	/**
	 * Method calculates the total area of all Objects
	 * @return
	 */
    public double getAreaOfAllObjects() {
        double totalArea = 0.0;
        for (Shape o : objects) {
            totalArea += o.getArea();
        }
        return totalArea;
    }
	
    /**
     * Method calculates the total circumference of all Objects
     * @return
     */
	public double getCirumferenceOfAllObjects() {
		double totalCirumference = 0.0;
		for (Shape o : objects) {
			totalCirumference += o.getCircumference();
		}
		return totalCirumference;
	}
	
	/**
	 * Method calculates the biggest area of an single Object
	 * @return
	 */
	public Shape biggestAreaObject() {
		Shape maxArea = objects.get(0);
		for(Shape o : objects) {
			if(maxArea.getArea() < o.getArea()){
				maxArea = o;
			}
		}
		return maxArea;
	}
	
	/**
	 * Methods prints out all Objects
	 */
	public void printOutAllObjects() {
		for (Shape o : objects) {
			o.toString();
		}
	}
}