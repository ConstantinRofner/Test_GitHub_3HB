package linkedList;

import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheesInserter {

	private static final Pattern vegetables = Pattern.compile(
			"Zuchini|Paprikas?|Zwiebeln?|Tomaten?"
			);
	
	public static void insertCheeseAroundVegetable(List<String> ingredients) {
		//Initialisierung Laufvariable
		//Abbruchbedingung (hasNext())
		//keine Inkrementierung -> passiert im Schleifenkörper
		for(ListIterator<String> iterator = ingredients.listIterator();iterator.hasNext();) {
			
		}
	}
	public static void main(String[] args) {
		
	}
}