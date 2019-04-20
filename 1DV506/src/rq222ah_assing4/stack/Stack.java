package rq222ah_assing4.stack;

import java.util.Iterator;

public interface Stack {

	// Current stack size
	int size();

	// true if stack is empty
	boolean isEmpty();

	// Add element at top of stack
	void push(Object element);

	/* Return and remove top element, exception if stack is empty */
	Object pop();

	Object peek(); /* Return (without removing) top element, exception if stack is empty. */

	// Element iterator
	Iterator<Object> iterator(); 
}
