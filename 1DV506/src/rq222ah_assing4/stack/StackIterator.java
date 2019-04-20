package rq222ah_assing4.stack;
import java.util.Iterator;

public class StackIterator implements Iterator<Object> {

	private Object[] elements;
	private int size;
	private int nextElement = 0;

	public StackIterator(Object[] elements, int size) {
		this.elements = elements;
		this.size = size;
	}

	public boolean hasNext() {
		if (nextElement >= this.size)
			return false;

		return true;
	}

	public Object next() {
		return elements[nextElement++];
	}

}
