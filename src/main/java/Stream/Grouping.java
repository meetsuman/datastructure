package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {

    private static class Employee{
        private String name;
        private String location;

        public Employee(String name, String location) {
            this.name = name;
            this.location = location;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", location='" + location + '\'' +
                    '}';
        }
    }


    public static void main(String[] args) {

        List<Employee> l=new ArrayList<>();

        l.add(new Employee("suman","hyd"));
        l.add(new Employee("sagar","hyd"));

        Map<String,List<Employee>> m=l.stream().collect(Collectors.groupingBy(Employee::getLocation));
        Map<String,List<String>> m1=l.stream().collect(Collectors.groupingBy(Employee::getLocation,Collectors.mapping(Employee::getName,Collectors.toList())));

        System.out.println(m+"\n"+m1);


    }

}
