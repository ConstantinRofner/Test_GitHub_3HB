package stack;

import java.util.Scanner;
import java.util.Stack;

public class CorrectClamping {

	public static boolean ClampingCorrect(String input) {
		int roundOpenBrackets = 0;
		int roundClosedBrackets = 0;
		int curvedOpenBrackets = 0;
		int curvedClosedBrackets =0;
		int squareOpenBrackets = 0;
		int squareClosedBrackets = 0;
		
        Stack<Character> stack = new Stack<>();
        
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
	}
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie einen Code ein, welcher überprüft werden soll:");
        String input = scanner.nextLine();
    }
}