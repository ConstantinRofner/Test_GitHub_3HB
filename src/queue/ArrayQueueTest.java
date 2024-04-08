package queue;

public class ArrayQueueTest{
	
	public static void main(String[] args) {
	
		ArrayQueue ArrayQueue = new ArrayQueue(5);

		ArrayQueue.queueEnqueue(2);
		ArrayQueue.queueEnqueue(5);
		
		ArrayQueue.queueFront();
		ArrayQueue.queueDequeue();
		ArrayQueue.queueDisplay();
	}
}