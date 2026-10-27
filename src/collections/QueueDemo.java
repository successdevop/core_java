package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(6);
        q.add(1);
        q.add(8);
        q.add(4);
        q.add(7);
        System.out.println(q);
        int num1 = q.remove();
        System.out.println("The element deleted from the head: "+num1);
        System.out.println("The queue after deletion: "+q);
        int num2 = q.peek();
        System.out.println("The head of the queue is: "+num2);
        q.clear();
        int size = q.size();
        System.out.println("Size of the queue: "+size);
    }
}