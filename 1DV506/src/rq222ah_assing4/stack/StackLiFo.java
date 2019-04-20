package rq222ah_assing4.stack;
import java.util.Iterator;

public class StackLiFo implements Stack {

	private Object[] list = new Object[10];
	int size;
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {

		return size == 0;
	}

	@Override
	public void push(Object element) {

		if (size >= list.length) {
			Object[] temp = new Object[list.length * 2];
			System.arraycopy(list, 0, temp, 0, list.length);
			list = temp;
		}

		list[size++] = element;
	}

	@Override
	public Object pop() {

		if (size == 0)
			throw new IllegalStateException("Stack is empty");

		return list[--size];
	}

	@Override
	public Object peek() {

		if (this.size == 0)
			throw new IllegalStateException("Stack is empty");

		return list[size - 1];
	}

	@Override
	public Iterator<Object> iterator() {

		return new StackIterator(list, size);
	}

}
