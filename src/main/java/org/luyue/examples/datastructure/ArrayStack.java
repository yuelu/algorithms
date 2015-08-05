package org.luyue.examples.datastructure;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> {

    private T[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        array = (T[]) new Object[2];
        size = 0;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        T item = array[size - 1];
        // avoid loitering objects (i.e objects not used and not gc)
        array[size - 1] = null;
        size--;

        if (size > 0 && size == (array.length / 4)) {
            resize(array.length / 2);
        }

        return item;
    }

    public void push(T item) {
        if (size == array.length) {
            resize(2 * array.length);
        }
        array[size++] = item;
    }

    private void resize(int newSize) {
        T[] copy = Arrays.copyOfRange(array, 0, newSize);
        array = copy;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
