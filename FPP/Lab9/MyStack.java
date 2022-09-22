package lab9;

public class MyStack {
	private MyStringLinkedList list;

	public MyStack() {
		list = new MyStringLinkedList();
	}

	public String pop() {
		// implement
		String res = list.get(0);
		list.remove(0);

		return res;
	}

	public String peek() {
		// implement
		return list.get(0);
	}

	public void push(String s) {
		// implement
		list.add(s);
	}

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		myStack.push("Bob");
		myStack.push("Harry");
		myStack.push("Alice");
		System.out.println("Popping…" + myStack.pop());
		System.out.println("Peeking…." + myStack.peek());
		System.out.println("Popping…" + myStack.pop());

	}
}
