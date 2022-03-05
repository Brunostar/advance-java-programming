package collection_implementation;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        SortedSet ss = new TreeSet(Arrays.asList(2,3,5));
        Object fe = ss.first();
        Object le = ss.last();
        ss.add(1);
        ss.add(4);
        SortedSet s1 = ss.headSet(3);
        SortedSet s2 = ss.tailSet(3);
        SortedSet s3 = ss.subSet(2, 5);

        System.out.println(fe);
        System.out.println(le);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
