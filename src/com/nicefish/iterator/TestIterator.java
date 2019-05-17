package com.nicefish.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TestIterator {
    public void testArrayList(){
        ArrayList list=new ArrayList();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void testLinkedList(){
        LinkedList list=new LinkedList();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        TestIterator testIterator=new TestIterator();
        testIterator.testArrayList();
        testIterator.testLinkedList();
    }

}
