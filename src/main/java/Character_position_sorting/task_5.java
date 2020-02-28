package Character_position_sorting;

import java.util.*;
import java.util.stream.IntStream;

public class task_5 {
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
    String simple = "";
    char [] chars = finalOrigin.toCharArray();
    ArrayList<Character> keys = new ArrayList<>();
    for (char a:chars) {
      if(!simple.contains(String.valueOf(a))){
        keys.add(a);
      }
      simple += a;
    }
    for (char a:keys) {
      System.out.println("chars: " + a + " : " + map.get(a));
    }
  }
}
