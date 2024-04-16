package stack;

import java.util.Scanner;
import java.util.Stack;

public class CorrectClamping {

    public static boolean ClampingCorrect(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie einen Code ein, welcher überprüft werden soll:");
        String input = scanner.nextLine();
        scanner.close();

        if (ClampingCorrect(input)) {
            System.out.println("Korrekte Klammerung");
        } else {
            System.out.println("Fehlerhafte Klammerung");
        }
    }
}
