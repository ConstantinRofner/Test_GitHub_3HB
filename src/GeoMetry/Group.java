package GeoMetry;

import java.util.ArrayList;

public class Group {
	
    private ArrayList<forAllObjects> objects;
    
	public Group() {
		this.objects = new ArrayList<forAllObjects>();
	}
	
	public ArrayList<forAllObjects> getObjects() {
		return objects;
	}
	public void setObjects(ArrayList<forAllObjects> objects) {
		this.objects = objects;
	}
    
	public void addObject(forAllObjects o) {
		this.objects.add(o);
	}
	
	public void deleteObject(forAllObjects o) {
		objects.remove(o);
	}
	
    public double getAreaOfAllObjects() {
        double totalArea = 0.0;
        for (forAllObjects o : objects) {
            totalArea += o.getArea();
        }
        return totalArea;
    }
	
	public double getCirumferenceOfAllObjects() {
		return 0;
		
	}
	
	public void biggestAreaObject() {
		
	}
	
	public void printOutAllObjects(forAllObjects o) {
		
	}
}