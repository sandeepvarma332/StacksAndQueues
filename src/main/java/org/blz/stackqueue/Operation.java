package org.blz.stackqueue;

public class Operation {
    public static StackQueue addelement() {
        StackQueue stacklist =new StackQueue();
        stacklist.push(70);
        stacklist.push(30);
        stacklist.push(56);

        stacklist.display();
        return stacklist;
    }

    public static void peek(){
        StackQueue stacklist =new StackQueue();
        stacklist.push(70);
        stacklist.push(30);
        stacklist.push(56);
        stacklist.peek();
    }

    public static void poptillempty(){
        System.out.println("\nBefore Pop:");
        StackQueue stacklist =addelement();
        stacklist.poptillend();
        System.out.println("\nAfter Pop:");
        stacklist.display();
    }
}