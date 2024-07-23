package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {

        Integer[] nums = {1, 5, 3, 4, 2, 65, 56, 78, 89, 121};
        List<Integer> numList = Arrays.asList(nums);
        Stream<Integer> stream = numList.stream();
        Stream<Integer> mappedStream = stream.map((num) -> num * num);

        List<Integer> squaredNums = new ArrayList<>(mappedStream.collect(Collectors.toList()));

        System.out.println(squaredNums);

//        List<Integer> squaredNumsShortCut = new ArrayList<>(numList.stream().map((num) -> num * num).collect(Collectors.toList()));

        // Filters out odd numbers
        List<Integer> squaredEvenNums = new ArrayList<>(squaredNums.stream().filter((num) -> num % 2 == 0).collect(Collectors.toList()));
        System.out.println(squaredEvenNums);


    }
}
