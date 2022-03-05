package collection_implementation;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {
        Queue empty = new PriorityQueue();
        Queue q = new PriorityQueue(Arrays.asList(7,4,5));
        q.add(3);
        q.add(6);
        q.offer(2);
        Iterator i = q.iterator();
        while (i.hasNext()) System.out.print(i.next()+" ");
        Object o1 = q.remove();
        Object o2 = q.poll();
        Object e = q.element();
        Object e1 = q.peek();

    }
}
