package collection_implementation;

import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        Map m = new HashMap();
        Map m1 = new HashMap(8);
        Map m2 = new HashMap(6, 1);
        Map m3 = new HashMap(m);
        m.put("uttam", "uttam1");
        m.put("bibhas", "bibhas1");
        m.put("parama", "parama1");

        String p1 = (String) m.get("uttam");
        String p2 = (String) m.get("parama");

        boolean b1 = m.containsKey("uttam");
        boolean b2 = m.containsKey("banhi");
        boolean b3 = m.containsValue("bibhas1");
        boolean b4 = m.containsValue("samiran");

        Set keys = m.keySet();
        for (Object k:keys) System.out.println(k+"->"+m.get(k));

        Collection values = m.values();
        for (Object v:values) System.out.print(v+" ");

        Set entries = m.entrySet();
        for(Object o:entries) {
            Map.Entry e = (Map.Entry)o;
            System.out.println(e.getKey()+"->"+e.getValue());
        }
        m.remove("uttam");

    }
}
