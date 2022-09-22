package lab9;

public class ArrayQueueImpl {
	private int[] arr;
	private int rear;
	private int front;
	private int capacity;
	private int size;
	private final int INITIAL_SIZE = 10;

	ArrayQueueImpl() {
		arr = new int[INITIAL_SIZE];
		capacity = INITIAL_SIZE;
		front = -1;
		rear = 0;
		size = 0;
	}

	public void enqueue(int num) {

		if (isFull()) {
			System.out.println("Queue full");
			resize();
		}

		System.out.println("Adding " + num);

		front++;
		arr[front] = num;
		size++;
	}
	
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("No Data Found");
			return -1;
		}

		int x = arr[rear];

		System.out.println("Removing " + x);

		rear++;
		size--;

		return x;
	}

	public void resize() {
		System.out.println("Resizing....");

		int[] temp = new int[capacity + INITIAL_SIZE];

		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}

		arr = temp;
		capacity = capacity + INITIAL_SIZE;
	}

	public int peek() {
		if (isEmpty())
			throw new IllegalStateException("Cannot peek because Queue is empty!");
		return arr[rear];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size() == 0);
	}

	public boolean isFull() {
		return (size() == capacity);
	}

	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();

		// uncomment when ready
		for (int i = 0; i < 15; i++)
			q.enqueue(i);
		for (int i = 0; i < 14; i++)
			q.dequeue();
		System.out.println(q.size());
		System.out.println(q.peek());
	}
}
