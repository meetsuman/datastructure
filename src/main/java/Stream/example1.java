package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class example1 {

    public static void main(String args[]) {

        // Count empty strings
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        //System.out.println("List: " + strings);
        long count;


        //Eliminate empty string
        List<String> filtered = new ArrayList<>();


        //Eliminate empty string and join using comma.
        String mergedString;

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        //get list of square of distinct numbers
        List<Integer> squaresList = new ArrayList<>();
        List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);


        //print ten random numbers
        /*Random random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }*/

        //System.out.println("Using Java 8: ");
        //System.out.println("List: " + strings);

        count = strings.stream().filter(string -> string.isEmpty()).count();
        count = strings.stream().filter(string -> string.startsWith("a")).count();
        //System.out.println("Empty Strings: " + count);


        count = strings.stream().filter(string -> string.length() == 3).count();
        //System.out.println("Strings of length 3: " + count);

        filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        filtered = strings.stream().filter(s-> !s.isEmpty()).collect(Collectors.toList());
        //System.out.println("Filtered List: " + filtered);

        mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
       // long ab = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.groupingBy());
        //System.out.println("Merged String: " + mergedString );

        squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        //System.out.println("Squares List: " + squaresList);
       // System.out.println("List: " + integers);

        IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
        System.out.println("Random Numbers: ");

       // random.ints().limit(10).sorted().forEach(System.out::println);

        //parallel processing
        count = strings.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println("Empty Strings: " + count);


    }
}