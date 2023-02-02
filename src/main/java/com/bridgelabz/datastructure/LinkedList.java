package com.bridgelabz.datastructure;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    public void push(T key){
        Node<T> newNode = new Node<>();
        if (head == null){
            head=newNode;
            tail= newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }

    }
}


