package collection_implementation;

import java.util.*;

public class LinkedLists {
    public static void main(String[] args) {
        Queue empty = new LinkedList();
        Queue q= new LinkedList(Arrays.asList(1,3));

        q.add(5);
        q.offer(7);

        for(Object o:q) System.out.print(0+" ");

        Iterator i = q.iterator();
        while (i.hasNext()) System.out.print(i.next()+" ");
        q.remove();
        q.poll();

        Object e = q.element();
        Object el = q.peek();

        Queue lifo = Collections.asLifoQueue(new LinkedList<>());
        lifo.add(1);
        lifo.add(2);
        lifo.add(3);
        lifo.add(4);

        int m1 = (int)lifo.remove();
        int m2 = (int)lifo.remove();
    }
}
