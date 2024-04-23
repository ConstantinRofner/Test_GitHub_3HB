package stack;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UPN {

	public static int calculateUPN(String input) {
		LinkedList<Integer> stack = new LinkedList<>();
		//operatorPattern: �berpr�ft auf mathematische Rechenzeichen
		Pattern operatorPattern = Pattern.compile("[+*-/]");
		//numericPattern: //d...Ziffer[0-9], + beliebig viele Ziffern
		Pattern numericPattern = Pattern.compile("\\d+");
		
		// \\s+...teilt den String auch nach mehreren Leerzeichen
		for(String token : input.split("\\s+")) {
			Matcher operatorMatcher = operatorPattern.matcher(token);
			Matcher numericMatcher = numericPattern.matcher(token);
			if(numericMatcher.matches()) {
				stack.push(Integer.parseInt(token));
			}else if(operatorMatcher.matches()){
				int operand1 = stack.pop();
				int operand2 = stack.pop();
				int result;
				switch(token) {
				case "+": result = operand1 + operand2; break;
				case "-": result = operand1 - operand2; break;
				case "*": result = operand1 * operand2; break;
				case "/": result = operand1 / operand2; break
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
	}
}