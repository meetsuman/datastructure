package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class collectionExa2 {

    public String emp_name;
    public String Location;

    collectionExa2(String emp_name,String Location) {
        this.emp_name = emp_name;
        this.Location = Location;
    }

    public static void main(String[] args) {
        //collectionExa2 ce2=new collectionExa2();
        Map<String,List> out=new HashMap<>();
        List<collectionExa2> c=new ArrayList<>();
        c.add(new collectionExa2("ab1","b1"));
        c.add(new collectionExa2("ab2","b1"));
        c.add(new collectionExa2("ab1","b2"));
        c.add(new collectionExa2("ab2","b2"));

        for(collectionExa2 abc : c){
          List<String> l= out.getOrDefault(abc.Location,new ArrayList());
          l.add(abc.emp_name);
          out.put(abc.Location,l);
        }
        System.out.println(out);
    }
}
