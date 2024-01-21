package GeoMetry;

import java.util.ArrayList;

public class Group {
	
    private ArrayList<Object> objects = new ArrayList<>();
    
    
	public ArrayList<Object> getObjects() {
		return objects;
	}
	public void setObjects(ArrayList<Object> objects) {
		this.objects = objects;
	}
    
	public void addObject(ArrayList<Object> objects) {
		objects.add(null);
	}
	
	public void deleteObject(ArrayList<Object> objects) {
		objects.remove(null);
	}
	
	public void getAreaOfAllObjects(ArrayList<Object> objects) {
		
	}
	
	public void getCirumferenceOfAllObjects() {
		
	}
	
	public void biggestObject() {
		
	}
	
	public void printOutAllObjects() {
		
	}
}