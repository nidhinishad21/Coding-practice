package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

       // Add2Num.add2Numbers(2, 1);

        MyLinkedList ll = new MyLinkedList();

        ll.add(1);
        ll.add(2);
        if(ll.find(3))
            System.out.println("Elememnt found");
        //ll.find(2);

        ll.print();

    }
}
