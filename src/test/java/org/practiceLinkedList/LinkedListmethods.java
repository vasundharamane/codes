package org.practiceLinkedList;

import java.util.*;

public class LinkedListmethods {
    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 4, 7, 2));

        linkedList.add(0, 0);

        linkedList.remove(2);

        System.out.println(linkedList);

        Iterator<Integer> iterator = linkedList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        System.out.println("--------------------");
        for (Integer i : linkedList) {
            System.out.println(i);
        }

        System.out.println("--------------------");
        ListIterator<Integer> listIterator = linkedList.listIterator(linkedList.size());

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
