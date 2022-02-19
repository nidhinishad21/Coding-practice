package com.company;

public class MyLinkedList {

    Node head;

    public boolean add(int num) {

        Node n=new Node(num);

        if (head==null)
        {
            head=n;
            return true;
        }

        Node copyHead = head;

        while(copyHead.next!=null) {
            copyHead = copyHead.next;
        }
        copyHead.next= n;

        return true;
    }

    /*public boolean delete(int num) {


    } */

    public boolean find(int num) {
        Node copyHead = head;

        while(copyHead!=null) {
           if(copyHead.value==num)
               return true;
           else
               copyHead=copyHead.next;

        }

        return false;
    }

    public void print() {

        Node copyhead =head;

        while(copyhead!=null){
            System.out.println(copyhead.getValue());
            copyhead=copyhead.next;
        }


        // 1 -> 2 -> 3 -> 4 ....
    }
}


