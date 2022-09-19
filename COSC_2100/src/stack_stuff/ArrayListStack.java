package stack_stuff;

import java.util.ArrayList;

public class ArrayListStack<T> implements StackInterface<T> {
	protected ArrayList<T> elements; // ArrayList that holds stack elements

	public ArrayListStack() {
		elements = new ArrayList<T>();
	}
	
	public void push(T element) { // Places element at top of this stack
		elements.add(element);
	}
}
