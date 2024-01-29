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
    
	public void addObject(Shape o) {
		this.objects.add(o);
	}
	
	public void deleteObject(Shape o) {
		objects.remove(o);
	}
	
    public double getAreaOfAllObjects() {
        double totalArea = 0.0;
        for (Shape o : objects) {
            totalArea += o.getArea();
        }
        return totalArea;
    }
	
	public double getCirumferenceOfAllObjects() {
		double totalCirumference = 0.0;
		for (Shape o : objects) {
			totalCirumference += o.getCircumference();
		}
		return totalCirumference;
	}
	
	public Shape biggestAreaObject() {
		Shape maxArea = objects.get(0);
		for(Shape o : objects) {
			if(maxArea.getArea() < o.getArea()){
				maxArea = o;
			}
		}
		return maxArea;
	}
	
	public void printOutAllObjects() {
		for (Shape o : objects) {
			o.
		}
	}
}