package com.company;

public class MyLinkedList {

    public Node head;
    public int size;

    public boolean add(int num) {
        Node n=new Node(num);
        size++;

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

    public boolean delete (int num) {
        Node copyHead = head;
        Node tbd ;

        if(head.value==num){
            head=null;
            size--;
        } else {

            while (copyHead != null) {
                if (copyHead.next.value == num) {

                    //tbd = copyHead;
                    tbd = copyHead.next;
                    Node current = copyHead;
                    Node tbdNext = tbd.next;

                    current.next = tbdNext;
                    tbd.next = null;
                    size--;
                    return true;
                } else
                    copyHead = copyHead.next;
            }
        }

        return false;
    }

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

   /* public void update (int num, int changeby) {

       // Node n=new Node(num);
        Node copyHead = head;


        if (head==null)

            return false;

      else

        while(copyHead.next!=null) {
            if(copyHead.value==val)
        }

    }

*/
    public void print() {

        Node copyhead =head;

        while(copyhead!=null){
            System.out.println(copyhead.getValue());
            copyhead=copyhead.next;
        }

        // 1 -> 2 -> 3 -> 4 ....
    }

    public boolean addLL(Node head2) {
        Node copyHead=head;

        while(copyHead.next!=null){

            copyHead=copyHead.next;
        }

        copyHead.next=head2;
        head2=null;

        return true;
    }
}




