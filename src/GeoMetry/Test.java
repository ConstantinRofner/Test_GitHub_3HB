package GeoMetry;

public class Test {

	public static void main(String[] args) {
		Group g = new Group();
		
		Shape r1 = new Rectangle(1, 1, 2, 4);
		Shape c1 = new Circle (2, 2, 5);
		Shape t1 = new Triangle(3, 3, 2, 3, 4, 5);
		Shape r2 = new Rectangle(5, 5, 3, 6);
		Shape r3 = new Rectangle(4, 3, 6, 9);
		
		//Funktionen um den Code zu testen:
		System.out.println(r1);
		System.out.println(c1);
		System.out.println(t1);
		
		System.out.println("Umfang des ersten Rechtecks r1: " + r1.getCircumference());
		System.out.println("Fl�che des ersten Rechtecks r1: " + r1.getArea());
		
		System.out.println("Umfang des Kreises: " + c1.getCircumference());
		System.out.println("Fl�che des Kreises: " + c1.getArea());
		
		System.out.println("Umfang des Dreiecks: " + t1.getCircumference());
		System.out.println("Fl�che des Dreiecks: " + t1.getArea());
		
		g.addObject(r1);
		g.addObject(r2);
		g.addObject(r3);
		g.addObject(c1);
		g.addObject(t1);

		System.out.println("Gesamtfl�che aller Objekte: " + g.getAreaOfAllObjects());
		System.out.println("Gesamtumfang aller Objekte: " + g.getCirumferenceOfAllObjects());
		
		System.out.println("Gr��te Fl�che eines einzelnen Objekts: " + g.biggestAreaObject());
		
		g.printOutAllObjects();	
	}
}