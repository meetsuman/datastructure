package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class example2 {
    public static void main(String[] args) {

        /*List<Integer> in= Arrays.asList(1,2,3,4,5,6);
        List<String> strings= Arrays.asList("abc","bcd");

        //System.out.println(in.stream().filter(x->!x.equals(1)).collect(Collectors.toList()));
        System.out.println(strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", ")));
        System.out.println(in.stream().map(x-> x * x).collect(Collectors.toList()));

        List<List<Integer> > number = new ArrayList<>();

        // adding the elements to number arraylist
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));

        System.out.println(number.stream().flatMap(x-> x.stream()).collect(Collectors.toList()));
        System.out.println(strings.stream().flatMap(x-> Stream.of(x.charAt(1))).collect(Collectors.toList()));*/

        List<Employee> l=new ArrayList<Employee>();
        l.add(new Employee("suman","bang"));
        l.add(new Employee("sum1","hyd"));
        l.add(new Employee("suman1","hyd"));
        l.add(new Employee("suman2","bang"));

        Map<String,List<Employee>> m=new HashMap<>();
        Map<String,List<String>> m1=new HashMap<>();

        m=l.stream().collect(Collectors.groupingBy(Employee::getLocation));
        for(int i=0;i<m.size();i++){

        }
        System.out.println(m);

        //l.stream().collect(Collectors.groupingBy(l.get()))


    }



}

class Employee{
    String EmployeeName;
    String Location;
    public Employee(String EmployeeName, String Location){
        this.EmployeeName=EmployeeName;
        this.Location=Location;
    }
    public String getEmployeeName() {
        return EmployeeName;
    }

    public String getLocation() {
        return Location;
    }
    @Override
    public String toString() {
        return String.format("%s,%s", EmployeeName, Location);
    }
}

