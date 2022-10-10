package assignment_2;

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
		// TODO Auto-generated method stub

	}
	
	@Override
	public T bottom() throws StackUnderflowException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub	
		return null;
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
