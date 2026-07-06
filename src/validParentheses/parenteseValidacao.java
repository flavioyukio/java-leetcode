package validParentheses;
import java.util.Stack;

public class parenteseValidacao {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {

				if (stack.isEmpty()) {
					return false;
				}

				char ultimo = stack.pop();

				if (c == ')' && ultimo != '(') {
					return false;
				}
				if (c == ']' && ultimo != '[') {
					return false;
				}
				if (c == '}' && ultimo != '{') {
					return false;

				}
			}
		}
		return stack.isEmpty();
	}
}