package lab8;

import java.util.Arrays;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = new Node(null);
	}

	// adds to the front of the list
	public void addFirst(String item) {
		Node n = new Node(item);
		// place new node after header and
		// establish links from new node to
		// surrounding nodes
		n.next = header.next;
		n.previous = header;

		// establish links from surrounding
		// nodes to the new node
		if (header.next != null) {
			header.next.previous = n;
		}
		header.next = n;
	}

	void insert(String data, int pos) {
		if (pos < 0)
			return;

		Node insertNode = new Node(data);

		Node next = header.next;
		int count = 0;
		while (next != null && count < pos) {
			next = next.next;
			count++;
		}

		if (next != null) {
			next.previous.next = insertNode;
			insertNode.previous = next.previous;

			insertNode.next = next;
			next.previous = insertNode;
		}
//		else if(next ==null && pos == count ) {
//			addLast(data);
//		}
	}

	boolean remove(String data) {

		// if list is empty, return
		if (header.next == null)
			return false;

		/*
		 * Node next = header.next; while (next != null && !next.value.equals(s)) { next
		 * = next.next; } // either next == null or next.value is s
		 * 
		 * return next;
		 */

		Node current = header.next;
		// traverse the list until current.next is
		// null - then remove current
		while (current.next != null && !current.value.equals(data)) {
			current = current.next;
		}

		if (current != null) {
			// now current.next == null, so remove current
			Node previous = current.previous;
			Node next = current.next;
			// previous is not null since current is not header
			previous.next = next;
			if (next != null)
				next.previous = previous;
			current.previous = null;
			return true;
		}

//		// now current.next == null, so remove current
//		Node previous = current.previous;
//		// previous is not null since current is not header
//		previous.next = null;
//		current.previous = null;

//		if (search(data)) {
//			Node n = searchAndReturnNode(data);
//		}

		return false;
	}

	// adds to the end of the list
	public void addLast(String item) {
		Node n = new Node(item);
		// find last node
		Node last = header;
		while (last.next != null) {
			last = last.next;
		}
		// now last.next == null
		last.next = n;
		n.previous = last;
	}

	// removes node in last position
	public void removeLast() {
		// if list is empty, return
		if (header.next == null)
			return;

		Node current = header;
		// traverse the list until current.next is
		// null - then remove current
		while (current.next != null) {
			current = current.next;
		}
		// now current.next == null, so remove current
		Node previous = current.previous;
		// previous is not null since current is not header
		previous.next = null;
		current.previous = null;
	}

	// determines whether the input string is in the list
	public boolean search(String s) {
		Node next = header.next;
		while (next != null && !next.value.equals(s)) {
			next = next.next;
		}
		// either next == null or next.value is s
		if (next == null)
			return false;
		else {// next.value.equals(s)
			return true;
		}
	}

	/******* sorting methods ********/
	public void minSort() {
		// implement
		new MinSortForNode(header.next).sort();
		;
		// new MinSort(strArray).sort();
	}

	public String toString() {
		var sb = new StringBuffer();
		Node next = header.next;
		while (next != null) {
			sb.append(next.toString() + ", ");
			next = next.next;
		}
		var result = sb.toString().trim();
		if (result.length() == 0)
			return "<empty list>";
		if (result.charAt(result.length() - 1) == ',') {
			return result.substring(0, result.length() - 1);
		}
		return result;
	}

	class Node {
		String value;
		Node next;
		Node previous;

		Node(String value) {
			this.value = value;
		}

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public void addSampleData(String[] arr) {
		for (String item : arr) {
			Node n = new Node(item);
			// find last node
			Node last = header;
			while (last.next != null) {
				last = last.next;
			}
			// now last.next == null
			last.next = n;
			n.previous = last;
		}

	}

	public static void main(String[] args) {
		var list = new MyStringLinkedList();
		list.addLast("rich");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.addFirst("bob");
		list.addFirst("harry");
		list.addFirst("steve");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		System.out.println(list.search("Harry"));
		System.out.println(list.search("Bob"));
		list.addLast("tom");
		System.out.println(list);
		list.insert("shafiq", 2);
		System.out.println(list);
		list.insert("asad", 2);
		System.out.println(list);
		list.remove("steve");

		System.out.println(list);
		String[] t = { "big", "small", "tall", "short", "round", "square", "enormous", "tiny", "gargantuan",
				"lilliputian", "numberless", "none", "vast", "miniscule", "alu" };

		list.addSampleData(t);
		System.out.println(list);
		list.minSort();
		System.out.println(list);
	}
}
