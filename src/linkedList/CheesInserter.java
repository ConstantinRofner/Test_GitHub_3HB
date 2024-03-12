package linkedList;

import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheesInserter {
	
	//private - Sichtbarkeitsbereich auf Klassen beschr�nkt
	//static - von der Klasse abh�ngig und nicht vom Object
	//final - Variable nach Initialisierung unver�nderbar
	private static final Pattern vegetables = Pattern.compile(
			"Zuchini|Paprikas?|Zwiebeln?|Tomaten?"
			);
	
	public static void insertCheeseAroundVegetable(List<String> ingredients) {
		//Initialisierung Laufvariable
		//Abbruchbedingung (hasNext())
		//keine Inkrementierung -> passiert im Schleifenk�rper
		for(ListIterator<String> iterator = ingredients.listIterator();iterator.hasNext();) {
			String ingredient = iterator.next();
		}
	}
	public static void main(String[] args) {
		
	}
}