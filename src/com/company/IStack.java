package com.company;

public interface IStack<E> {
    E push(E item);
    E pop();
    E peek();//取出栈顶元素
    int size();
    boolean empty();
}
