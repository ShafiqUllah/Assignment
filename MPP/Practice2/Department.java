package lab4.practice2;

public abstract class Department {
	private StringQueue queue = new StringQueue();
	public StringQueue getQueue() {
		return queue;
	}
	//implement

	public abstract String getName();
	

	public void addMessage(String msg) {
		StringQueue stringQueue = getQueue();
		stringQueue.enqueue(msg);
	}
	
	public String nextMessage() throws EmptyQueueException {
		return getQueue().dequeue();
	}
}
