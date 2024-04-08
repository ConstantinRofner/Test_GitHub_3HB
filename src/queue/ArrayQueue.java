package queue;

public class ArrayQueue {

	private static int front;
	private static int rear;
	private static int capacity;
	private static int[] queue;
	
	/**
	 * Method creates an ArrayQueue which is empty
	 * @param size
	 */
	public ArrayQueue(int size) {
		front = 0;
		rear = 0;
		capacity = size;
		queue = new int[size];
	}
	
	/**
	 * method adds an item at the rear
	 * @param item
	 */
	public void queueEnqueue(int item) {
		if(rear == capacity) {
			System.out.println("Queue ist voll.");
		}else {
			queue[rear]=item;
			rear++;
		}
	}
	
	/**
	 * method deletes the element at the rear and pushes the other forward
	 * @return
	 */
	public int queueDequeue() {
		int firstElement = 0;
		if(rear == front) {
			System.out.println("Queue ist leer.");
		}else {
			firstElement = queue[front];
			//TODO Elemente im Array verrücken
			for(int i=0; i<(rear-1); i++) {
				queue[i] = queue[i+1];
			}
			if(rear < capacity) {
				queue[rear] = 0;
			}
			rear--;
		}
		return firstElement;
	}
	
	/**
	 * method prints out the whole ArrayQueue
	 */
	public void queueDisplay() {
		if(front == rear) {
			System.out.println("Queue is empty");
		}else {
			for(int i = front; i < rear; i++) {
				System.out.println(i);
			}
		}
	}
	
	/**
	 * method calculates which element is the one at the front
	 * @return
	 */
	public int queueFront() {
		int firstElement = 0;
		//TODO erstes Element ohne Löschen zurückgeben
		if(front == rear) {
			System.out.println("Queue is empty");
		}else {
			firstElement = queue[front];
		}
		return firstElement;
	}
}