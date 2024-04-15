package stack;

import java.util.Scanner;
import java.util.Stack;

public class reverseWords {
	
	/**
	 * methods contains other methods which reverse the string
	 * @param input
	 * @return
	 */
    public static String reverseString(String input) {
        /**
         * Method creates a stack
         */
        Stack<Character> stack = new Stack<>();
        /**
         * for-each method transforms all elements into chars
         */
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        /**
         * creates an String which saves the letters in the reversed order
         */
        StringBuilder reverseString = new StringBuilder();
        while (!stack.isEmpty()) {
            reverseString.append(stack.pop());
        }
        return reverseString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie einen String ein, der umgekehrt werden soll:");
        String input = scanner.nextLine();

        String reversed = reverseString(input);
        System.out.println("Der umgekehrte String lautet: " + reversed);
    }
}