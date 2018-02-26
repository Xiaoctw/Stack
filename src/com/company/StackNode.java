package com.company;

public class StackNode<E> {
    private E data;
    private StackNode<E> next;

    public StackNode() {}

    public StackNode(E data, StackNode<E> next) {
        super();
        this.data = data;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public StackNode<E> getNext() {
        return next;
    }

    public void setNext(StackNode<E> next) {
        this.next = next;
    }
}
