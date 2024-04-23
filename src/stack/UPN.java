package stack;

import java.util.LinkedList;
import java.util.regex.Pattern;

public class UPN {

	public static int calculateUPN(String input) {
		LinkedList<Integer> stack = new LinkedList<>();
		//operatorPattern: überprüft auf mathematische Rechenzeichen
		Pattern operatorPattern = Pattern.compile("[+*-/]");
		//numericPattern: //d...Ziffer[0-9], + beliebig viele Ziffern
		Pattern numericPattern = Pattern.compile("\\d+");
		
		for(String token : input.split("\\s+")) {
			
		}
	}
	
	public static void main(String[] args) {
		
	}
}