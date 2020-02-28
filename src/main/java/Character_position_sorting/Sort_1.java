package Character_position_sorting;

import java.util.*;
import java.util.stream.IntStream;

public class Sort_1 {
  public static void main(String[] args) {
    String origin = "Hello World";
    origin = origin.toLowerCase();
    HashMap<Character, List<Integer>> map = new HashMap<>();

    String finalOrigin = origin;
    IntStream.range(0, origin.length()).forEach(i -> {
      char c = finalOrigin.charAt(i);
      List<Integer> positions = map.getOrDefault(c, new ArrayList<>());
      positions.add(i);
      map.put(c, positions);
    });

    HashMap<Character, List<Integer>> sorted = new HashMap<>();
    ArrayList<Character> keys = new ArrayList<>(map.keySet());
    Collections.sort(keys);
     //System.out.printf("Letter: '%c', positions:%s\n", c, n));
    for (char a:keys) {
      System.out.println("chars: " + a + " : " + map.get(a));
    }
  }
}