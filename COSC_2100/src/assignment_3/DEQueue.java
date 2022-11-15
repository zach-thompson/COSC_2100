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
		DLLNode<T> temp = new DLLNode<T>(element);
		
		if (isEmpty()) {
			front = rear = temp;
		}
		else {
			temp.setForward(front);
			front.setBack(temp);
			front = temp;
		}
		numElements++;
	}

	public void enqueueRear(T element) {
		DLLNode<T> temp = new DLLNode<T>(element);
		
		if (isEmpty()) {
			front = rear = temp;
		}
		else {
			temp.setBack(rear);
			rear.setForward(temp);
			rear = temp;
		}
		numElements++;
	}

	public T dequeueFront() throws QueueUnderflowException {
		DLLNode<T> temp = front;
		
		if (isEmpty()) {
			throw new QueueUnderflowException();
		}
		
		if (numElements == 1) {
			front = rear = null;
		}
	    else {
	        front = front.getForward();
	        front.setBack(null);
	    	}
		
		numElements--;
		return temp.getInfo();
	}

	public T dequeueRear() throws QueueUnderflowException {
		DLLNode<T> temp = rear;
		
		if (isEmpty()) {
			throw new QueueUnderflowException();
		}
		
		if (numElements == 1) {
			front = rear = null;
		}
	    else {
	        rear = rear.getBack();
	        rear.setForward(null);
	    	}
		
		numElements--;
		return temp.getInfo();
	}

	public String toString() {
		String queue = "";
		DLLNode<T> temp = front;
		
		if (isEmpty()) {
			throw new QueueUnderflowException("Nothing to print");
		}
		
		// if there's only one element in the queue
		if (temp.getForward() == null) {
			queue = temp.getInfo() + "";
			return queue;
		}
		
		while (temp != null) {
			if (temp.getForward() == null) {
				queue += temp.getInfo();
			}
			else {
				queue += temp.getInfo() + "<-->";
			}
			temp = temp.getForward();
		}
		return queue;
	}
}
