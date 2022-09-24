package lab10;

public class EmployeeBST {

	NameComparator nameComparator;
	/** The tree root. */
	private Node root;

	public EmployeeBST(NameComparator nameComparator) {
		super();
		this.nameComparator = nameComparator;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order.
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	private void printTree(Node t) {
		if (t != null) {
			printTree(t.left);
			System.out.println(t.employee.toString());
			printTree(t.right);
		}
	}

	public boolean find(Employee x) {
		if (x == null)
			return false;
		return find(x, root);
	}

	private boolean find(Employee x, Node n) {
		if (n == null)
			return false;
		if (n != null && n.employee.equals(x))
			return true;
//		return (x.com(n.employee, nameComparator) < 0) ?
//				find(x,n.left) :
//				find(x,n.right);
		nameComparator.compare(x, n.employee);
		return true;
//		
	}

	public void insert(Employee x) {
		if (root == null) {
			root = new Node(x, null, null);
		} else {
			Node n = root;
			boolean inserted = false;
			while (!inserted) {
				if (nameComparator.compare(x, n.employee) < 0) {
					// space found on the left
					if (n.left == null) {
						n.left = new Node(x, null, null);
						inserted = true;
					} else {
						n = n.left;
					}
				}

				else if (nameComparator.compare(x, n.employee) >= 0) {
					// space found on the right
					if (n.right == null) {
						n.right = new Node(x, null, null);
						inserted = true;
					} else {
						n = n.right;
					}
				}

			}

		}
	}

	private class Node {

		private Employee employee; // The data in the node
		private Node left; // Left child
		private Node right; // Right child

		// Constructors
		Node(Employee theEmployee) {
			this(theEmployee, null, null);
		}

		Node(Employee employee, Node left, Node right) {
			this.employee = employee;
			this.left = left;
			this.right = right;
		}

	}

}
