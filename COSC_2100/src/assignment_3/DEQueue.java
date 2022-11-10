package assignment_3;

/**
 * COSC 2100 – Fall 2022
 * Assignment#4
 * @author Dr. Niharika Jain
 * Assignment problem based on double-ended queue
 */

public class DEQueue<T> implements DequeInterface<T> {

	protected DLLNode<T> front;      // reference to the front and rear of this deque
	protected DLLNode<T> rear;
	protected int numElements = 0; 	 // number of elements in this dequeue

	public DEQueue() {
		front = null;
		rear = null;
	}

	public boolean isFull() {
		return false;
	}

	public boolean isEmpty() {
		return (numElements == 0);
	}

	public int size() {
		return numElements;
	}

	public void enqueueFront(T element) {
		//TODO(1) Implement this method to add element to the front	

	}

	public void enqueueRear(T element) {
		//TODO(2) Implement this method to add element to the rear

	}

	public T dequeueFront() throws QueueUnderflowException {
		//TODO(3) Implement this method to remove element from the front
		return null;
	}

	public T dequeueRear() throws QueueUnderflowException {
		//TODO(4) Implement this method to remove element from the rear
		return null;
	}

	public String toString() {
		//TODO(5) Implement this method to print a nicely formatted deque
		return null;
	}
}
