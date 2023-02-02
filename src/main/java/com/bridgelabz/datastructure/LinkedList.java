package com.bridgelabz.datastructure;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void push(T key) {
        Node<T> newNode = new Node<>(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.next == null) {
                System.out.print(temp.key);
            } else {
                System.out.print(temp.key + " -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public void insert(T key, int position) {
        //Create a new node
        Node<T> newNode = new Node(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp, current;
            temp = head;
            current = null;
            for (int i = 0; i < position; i++) {
                current = temp;
                temp = temp.next;
            }
            current.next = newNode;
            newNode.next = temp;
        }

    }

    public void  pop() {
        if (head == null) {
            System.out.println("List is empty");

        } else {

            if (head != tail) {
                head = head.next;
            }
            else {
                head = tail = null;
            }
        }
    }
    public void  popLast(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            if(head != tail ) {
                Node current = head;
                while(current.next != tail) {
                    current = current.next;
                }
                tail = current;
                tail.next = null;
            }
            else {
                head = tail = null;
            }
        }
    }
    public Node<T> searchNode(T key) {
        Node<T> current = head;
        Node<T> tempNode = null;
        int i = 1;
        boolean flag = false;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            while(current != null) {
                if(current.key == key) {
                    flag = true;
                    tempNode = current;

                    break;
                }
                i++;
                current = current.next;
            }
        }
        if(flag)
            return tempNode;
        else
            System.out.println("Element is not present in the list");
        return null;
    }
    public void searchAndInsert(T searchKey,T insertKey) {
        Node<T> searchNode = searchNode(searchKey);//30
        Node<T> temp=searchNode.next;
        Node<T> newNode = new Node<>(insertKey);//40
        if (searchNode!=null){
            searchNode.next=newNode;//30=>40
            newNode.next=temp;//40=?70
        }}

}









