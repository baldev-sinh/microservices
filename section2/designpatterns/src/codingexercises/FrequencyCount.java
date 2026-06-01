package codingexercises;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

  public static void main(String[] args) {

    String str = "Baaldeev";
    Map<Character, Integer> map = new HashMap<>();

    for (char c : str.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    System.out.println(map);

  }


}
