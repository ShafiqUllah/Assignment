package lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer {
	String ODD_DELIMITER = "" + (char) 0;
	String filename;
	String text;
	char[] left;
	char[] right;

	public SymbolBalancer(String filename) {
		this.filename = filename;
		readFile();
	}

	public void setText(String text) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '(' || text.charAt(i) == '{' || text.charAt(i) == '[' || text.charAt(i) == '<'
					|| text.charAt(i) == ')' || text.charAt(i) == '}' || text.charAt(i) == ']' || text.charAt(i) == '>'
					|| text.charAt(i) == '|') {
				sb.append(text.charAt(i));
			}
		}

		this.text = sb.toString();
		// System.out.println(this.text);
	}

	boolean symbolsBalanced(String delimiters) {
		// implement
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < delimiters.length(); i++) {
			if (delimiters.charAt(i) == '(' || delimiters.charAt(i) == '{' || delimiters.charAt(i) == '['
					|| delimiters.charAt(i) == '<') {

				if (delimiters.charAt(i) == '(') {
					stack.push((char) (delimiters.charAt(i) + 1));
				} else {
					stack.push((char) (delimiters.charAt(i) + 2));
				}

			} else if (delimiters.charAt(i) == '|') {
				if (!stack.empty()) {
					if (stack.peek() == delimiters.charAt(i))
						stack.pop();
					else
						stack.push(delimiters.charAt(i));
				}else
					stack.push(delimiters.charAt(i));
					
			} else if (!stack.empty()) {
				if (stack.peek() == delimiters.charAt(i))
					stack.pop();
				else
					return false;
			} else {
				return false;
			}
		}

		if (!stack.empty())
			return false;

		return true;

	}

	public static void main(String[] args) {
		SymbolBalancer sb = new SymbolBalancer("lab9\\Employee.java");
		System.out.println(sb.symbolsBalanced("[]||{}<>(||)||"));
		System.out.println(sb.symbolsBalanced(sb.text));
	}

	void readFile() {
		String prefix = System.getProperty("user.dir") + "\\src\\";
		try {
			Scanner sc = new Scanner(new File(prefix + filename));
			sc.useDelimiter(ODD_DELIMITER);
			text = sc.next();
			// System.out.println(text);
			setText(text);
			sc.close();
		} catch (FileNotFoundException ex) {
			System.err.println("File Not Found Exception " + ex.getMessage());
		}
	}

}
