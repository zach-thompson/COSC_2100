package stack_stuff;

public class StackInterface<T> {
	void push(T element) throws StackOverflowException;
		// throws exception if stack is full
		// otherwise adds this element to top of stack
	
	void pop() throws StackUnderflowException;
		// throws exception if stack is full
		// otherwise removes top element
	
	T top() throws StackUnderflowException;
		// throws exception if stack is full
		// otherwise returns top element
	
	boolean isEmpty();
		// Returns true if stack is empty, otherwise returns false
		
	boolean isFull();
		// Returns true is stack is full, otherwise returns false
}
