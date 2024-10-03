package org.practiceLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListForQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("a");
        queue.add("b");

        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
