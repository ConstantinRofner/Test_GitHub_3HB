package String_StringBuilder;

import java.util.LinkedList;

public class SumOfTheDigits {

	public static void main(String[] args) {
	
		public static int digitSum(long value) {
			String str = Long.toString(value);
			LinkedList<Integer> stack = new LinkedList<>();
			
			for (String s : str.split("")) {
				stack.push(Integer.parseInt(s));
			}
	}
	
}