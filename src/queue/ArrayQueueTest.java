package queue;

public class ArrayQueueTest
{
    public static void main(String[] args) {
    	
        ArrayQueue arrayQueue = new ArrayQueue(5);

        arrayQueue.queueEnqueue(2);
        arrayQueue.queueEnqueue(5);

        arrayQueue.queueDequeue();
        arrayQueue.queueDisplay();
    }
}