package com.bridgelabz.datastructure;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.display();

//            linkedList1.pop();
//            linkedList1.display();

//            linkedList1.popLast();
//            linkedList1.display();
        linkedList1.searchNode(30);

    }

}









