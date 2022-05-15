package collection;

import java.util.*;

public class collectionExa1 {


    public ArrayList<String> add1(String employee, String location){
        List<String> ab=new ArrayList<String>();
        ab.add(employee);ab.add(location);
        return (ArrayList<String>) ab;
    }

    public static void main(String[] args) {
        collectionExa1 ce=new collectionExa1();
        Map<String,String> mp=new HashMap();
        Map<String,List<String>> mp1=new HashMap();
        List<String> abc1=new ArrayList<String>();
        List<String> abc2=new ArrayList<String>();

       /*List<ArrayList> l=new ArrayList<>();
        l.add(ce.add1("ab1","b1"));
        l.add(ce.add1("ab2","b1"));
        l.add(ce.add1("abc1","b2"));
        l.add(ce.add1("abc2","b2"));

        System.out.println(l.size());
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i).get(1));
        }*/
        mp.put("ab1","b1");
        mp.put("ab2","b1");
        mp.put("ab3","b2");
        mp.put("ab4","b2");
        System.out.println(mp);

        for(Map.Entry<String,String> ent: mp.entrySet()){
            if(abc1.contains(ent.getValue())){
                mp1.get(ent.getValue()).add(ent.getKey());
                System.out.println("1 "+mp1);
            }
            else{
                mp1.put(ent.getValue(), new ArrayList<>());
                mp1.get(ent.getValue()).add(ent.getKey());
                abc1.add(ent.getValue());
                System.out.println("2 "+ mp1);
            }
        }

        System.out.println(mp1);

    }
}
