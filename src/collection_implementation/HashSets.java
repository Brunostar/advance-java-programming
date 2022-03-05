package collection_implementation;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSets {
    public static void main(String args[]) {
        Set empty = new HashSet();
        Set even = new HashSet(Arrays.asList(0,2,4));
        Set copy = new HashSet(even);
        Set blank = new HashSet(8);
        Set nullSet = new HashSet(8, 1);

        even.add(6);
        even.add(8);

        for (Object o:even) System.out.print(o+" ");
        System.out.println("");
        Iterator i = even.iterator();
        while (i.hasNext()) System.out.print(i.next()+" ");
        System.out.println("");
        for(Iterator j = even.iterator(); j.hasNext();) System.out.print(j.next()+" ");
        System.out.println(even.size());
        if(blank.size() == 0) System.out.println("empty set");

        boolean c1 = even.contains(6);
        boolean c2 = even.contains(10);

        Object[] a = even.toArray();
        even.remove(4);

        Set s1 = new HashSet(Arrays.asList(1,2,3));
        Set s2 = new HashSet(Arrays.asList(2,3,4,5));
        Set s3 = new HashSet(s1);
        s3.addAll(s2);
        s3 = new HashSet(s1);
        s3.retainAll(s2);
        s3 = new HashSet(s1);
        s3.removeAll(s2);
    }
}
