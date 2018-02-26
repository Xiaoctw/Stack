package com.company;

public class LinkStack<E> implements IStack<E> {
    private StackNode<E> top;
    private int size;

    public StackNode<E> getTop() {
        return top;
    }

    public void setTop(StackNode<E> top) {
        this.top = top;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public LinkStack() {
        size=0;
        top=null;

    }

    @Override
    public E push(E item) {
        StackNode<E> node=new StackNode<E>(item,null);
        if(!empty()){
            node.setNext(top);
        }
        top=node;
        size++;
        return item;
    }

    @Override
    public E pop() {
        E item=null;
        if(!empty()){
            item=top.getData();
            top=top.getNext();
            size--;
        }
        return item;
    }

    @Override
    public E peek() {
        E item=null;
        if(!empty()){
            item=top.getData();
        }
        return item;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean empty() {
        if(top==null&&size==0){
            return true;
        }
        return false;
    }
    public void ergodic(){
        StackNode<E> node=top;
        while (node!=null){
            System.out.print(node.getData()+" ");
            node=node.getNext();
        }
    }
}
