package com.company;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyLinkedListTest {

    @Test
    public void testAddNode() {
        MyLinkedList l1 = new MyLinkedList();
        l1.add(1);

        assertEquals(l1.find(1), true);
        assertEquals(l1.size, 1);
    }

    @Test
    public void testFindNode() {
        MyLinkedList l1 = new MyLinkedList();
        l1.add(1);

        assertEquals(l1.find(1), true);
        assertEquals(l1.size, 1);
        assertEquals(l1.find(3), false);
    }

    @Test
    public void testDeleteNode(){
        MyLinkedList l1=new MyLinkedList();
        l1.add(3);
        l1.delete(3);
        assertEquals(l1.find(3), false);
        assertEquals(l1.size, 0);

    }

}
