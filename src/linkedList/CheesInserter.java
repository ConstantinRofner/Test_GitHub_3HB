package linkedList;

import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheesInserter {
	
	//private - Sichtbarkeitsbereich auf Klassen beschränkt
	//static - von der Klasse abhängig und nicht vom Object
	//final - Variable nach Initialisierung unveränderbar
	private static final Pattern vegetables = Pattern.compile(
			"Zuchini|Paprikas?|Zwiebeln?|Tomaten?"
			);
	
	public static void insertCheeseAroundVegetable(List<String> ingredients) {
		//Initialisierung Laufvariable
		//Abbruchbedingung (hasNext())
		//keine Inkrementierung -> passiert im Schleifenkörper
		for(ListIterator<String> iterator = ingredients.listIterator();iterator.hasNext();) {
			String ingredient = iterator.next();
		}
	}
	public static void main(String[] args) {
		
	}
}