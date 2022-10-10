package assignment_2;

public interface NewStackInterface<T>
{
	  void push(T element) throws StackOverflowException;
	  // Throws StackOverflowException if this stack is full,
	  // otherwise places element at the top of this stack.

	  void pop() throws StackUnderflowException;
	  // Throws StackUnderflowException if this stack is empty,
	  // otherwise removes top element from this stack.
	  
	  T top() throws StackUnderflowException;
	  // Throws StackUnderflowException if this stack is empty,
	  // otherwise returns top element of this stack.
	  
	  boolean isEmpty();
	  // Returns true if this stack is empty, otherwise returns false.

	  boolean isFull();
	  // Returns true if this stack is full, otherwise returns false.
	  
	  void popFromBottom() throws StackUnderflowException;
	  //Throws StackUnderflowException if this stack is empty,
	  // otherwise removes the element from the bottom of this stack.
	  
	  T bottom() throws StackUnderflowException;
	  //Throws StackUnderflowException if this stack is empty,
	  // otherwise returns bottom element of this stack.
	  
	  String toString();
	  // Creates and returns a string that correctly represents this stack.
	  
	  int size();
	  // Returns the number of elements in this stack
	}
