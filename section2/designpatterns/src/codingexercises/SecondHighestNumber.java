package codingexercises;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {

  public static void main(String[] args) {

    List<Integer> integers = List.of(1, 2, 3, 3, 4, 4, 5);

    Optional<Integer> first = integers.stream()
        .distinct()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst();

    System.out.println(first.get());

  }


}
