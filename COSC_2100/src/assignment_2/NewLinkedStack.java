package assignment_2;

/*
 * COSC 2100 - Fall '22
 * Assignment #2
 * Author: Zach Thompson
 * Description: Contains definitions for most methods used in main.c for this assignment
 * Methods not included: getNum, getMax - supplementary methods in main.c to make the main function clearer
 */

public class NewLinkedStack<T> implements NewStackInterface<T>
{
	protected LLNode<T> top;   // reference to the top of this stack

	public NewLinkedStack()
	{
		top = null;
	}

	public void push(T element)
	// Places element at the top of this stack.
	{ 
		LLNode<T> newNode = new LLNode<T>(element);
		newNode.setLink(top);
		top = newNode;
	}     

	public void pop()
	// Throws StackUnderflowException if this stack is empty,
	// otherwise removes top element from this stack.
	{                  
		if (isEmpty())
			throw new StackUnderflowException("Pop attempted on an empty stack.");
		else
			top = top.getLink();
	}

	public T top()
	// Throws StackUnderflowException if this stack is empty,
	// otherwise returns top element of this stack.
	{                 
		if (isEmpty())
			throw new StackUnderflowException("Top attempted on an empty stack.");
		else
			return top.getInfo();
	}

	public boolean isEmpty()
	// Returns true if this stack is empty, otherwise returns false.
	{              
		return (top == null); 
	}

	public boolean isFull()
	// Returns false - a linked stack is never full
	{              
		return false;
	}
	
	@Override
	public void popFromBottom() throws StackUnderflowException {
		if (isEmpty()) {
			throw new StackUnderflowException("Top attempted on an empty stack.");
		}
		
		LLNode<T> temp = top;
		LLNode<T> next = top;
		while (temp.link != null) {
			next = temp;
			temp = temp.link;
		}
		next.setLink(null);
	}
	
	@Override
	public T bottom() throws StackUnderflowException {
		if (isEmpty()) {
			throw new StackUnderflowException("Top attempted on an empty stack.");
		}
		
		LLNode<T> temp = top;
		LLNode<T> next = top;
		while (temp.link != null) {
			next = temp;
			temp = temp.link;
		}
		return next.getInfo(); 
	}
	
	@Override
	public String toString() {
		String result = "";
        LLNode<T> base = top;
        while(base.link != null){
            result += base.getInfo() + "\n\t";
            base = base.link;
        }
        return "Top --> " + result;
	}
	
	@Override
	public int size() {
		LLNode<T> temp = top;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.link;
		}
		return count;
	}

}
