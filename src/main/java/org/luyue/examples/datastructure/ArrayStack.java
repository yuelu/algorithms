package org.luyue.examples.datastructure;

import java.util.EmptyStackException;

public class ArrayStack<T> {

    private T[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        array = (T[]) new Object[capacity];
        size = 0;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return array[--size];
    }

    public void push(T item) {
        if (size == array.length) {
            throw new StackOverflowError();
        }
        array[size++] = item;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
