package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MyLinkedList ll = new MyLinkedList();
        MyLinkedList ll2 = new MyLinkedList();


        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        //ll.print();
       // ll.delete(3);

        ll2.add(5);
        ll2.add(6);
        ll2.add(7);

        ll.addLL(ll2.head);
        ll.print();


    }
}
