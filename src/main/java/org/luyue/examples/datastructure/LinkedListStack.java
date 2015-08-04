package org.luyue.examples.datastructure;

import java.util.EmptyStackException;

public class LinkedListStack<T> {

    private class Node {
        private T item;
        private Node next;
    }

    private Node head;

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        T item = head.item;
        head = head.next;

        return item;
    }

    public void push(T item) {

        Node oldHead = head;
        head = new Node();
        head.item = item;
        head.next = oldHead;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
