package stack_stuff;

public class ArrayBoundedStack<T> implements StackInterface<T> {

	protected final int DEFCAP = 100; // default capacity
	protected T[] elements;			  // holds stack elements
	protected int topIndex = -1; 	  // index of top element in stack

	public ArrayBoundedStack() {
		elements = (T[]) new Object[DEFCAP];
	}
	
	public ArrayBoundedStack(int maxSize) {
		elements = (T[]) new Object[maxSize];
	}
	
	public void push(T element) {
		// throws exception if stack is full
		// otherwise places element on top of stack
		if (isFull()) {
			throw new StackOverflowException("Push attempted on a full stack");
		}
		else {
			topIndex++;
			elements[topIndex] = element;
		}
	}
	
	public void pop() {
		// throws exception if stack is full
		// otherwise places element on top of stack
		if (isEmpty()) {
			throw new StackUnderflowException("Pop attempted on empty stack");
		}
		else {
			elements[topIndex] = null;
			topIndex--;
		}
	}
	
	public T top() {
		// throws exception if stack is full
		// otherwise returns top element on stack
		T topOfStack = null;
		if (isEmpty()) {
			throw new StackUnderflowException("Top attempted on empty stack");
		}
		else {
			topOfStack = elements[topIndex];
			return topOfStack;
		}
	}
	
	public boolean isEmpty() {
		return (topIndex == -1);
	}

	public boolean isFull() {
		return (topIndex == (elements.length -1));
	}
}
