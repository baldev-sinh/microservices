package codingexercises;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

  public static void main(String[] args) {
    List<Integer> integers = List.of(1, 2, 3, 3, 4, 4, 5);

    Set<Integer> set = new HashSet<>();

    List<Integer> collect = integers.stream()
        .filter(n -> !set.add(n))
        .collect(Collectors.toList());

    System.out.println(collect);

    // count sum using reduce
    Integer reduce = integers.stream()
        .reduce(0, Integer::sum);
    System.out.println(reduce);

  }


}
