package collection.arraylist;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class setExample {
    public static void main(String[] args) {
        Set<Integer> st=new HashSet<>();
        st.add(1);
        st.add(3);
        st.add(2);
        st.add(1);
        System.out.println(st);
    }
}
