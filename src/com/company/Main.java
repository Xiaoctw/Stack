package com.company;


import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        LinkStack<Integer> stack = new LinkStack<Integer>();
        int[] data = {12, 2, 3, 34, 56, 45, 67, 5};
        System.out.println("------入栈操作------");
        for (int i = 0; i < data.length; i++) {
            stack.push(data[i]);
            System.out.println(data[i] + "入栈");
        }
        StackNode<Integer> node=new StackNode<Integer>();
        node=stack.getTop();
        System.out.println("-------------");
        for (int i = 0; i <stack.getSize() ; i++) {
            System.out.print(node.getData()+" ");
            node=node.getNext();
        }
        System.out.println();
        stack.ergodic();
        try {
           PrintStream printStream=new PrintStream("xiao");
           PrintStream out=System.out;
           System.setOut(printStream);
           stack.ergodic();
           System.setOut(out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
