package collection_implementation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayLists {
    public static void main(String[] args) {
        List el = new ArrayList();
        List l = new ArrayList(Arrays.asList(2,3));
        List ll = new ArrayList(10);
        l.add(2);
        l.add(2, 4);
        Object ol = l.get(1);
        ListIterator li = l.listIterator();
        while (li.hasNext()) System.out.print(li.next()+" ");
        while (li.hasPrevious()) System.out.print(li.previous()+" ");
        List sl = l.subList(1, 3);
        int sz = l.size();

        if(el.size() == 0) System.out.println("empty list");
        boolean e1 = l.isEmpty();
        boolean e2 = el.isEmpty();

        l.remove(2);
        l.remove(new Integer(3));

        int first = l.indexOf(2);
        int last  = l.lastIndexOf(2);
        l.set(0, 4);
    }
}
