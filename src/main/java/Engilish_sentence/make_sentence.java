package Engilish_sentence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class make_sentence {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    List<String> subjects = new ArrayList<>(Arrays.asList("Noel", "The cat", "The dog"));
    List<String> verbs =    new ArrayList<>(Arrays.asList("wrote", "chased", "slept on"));
    List<String> objects =  new ArrayList<>(Arrays.asList("the book","the ball","the bed"));
    for (int i = 0; i < subjects.size(); i++) {
      for (int j = 0; j < verbs.size(); j++) {
        for (int k = 0; k < objects.size(); k++) {
          sb.append(subjects.get(i));
          sb.append(" ");
          sb.append(verbs.get(j));
          sb.append(" ");
          sb.append(objects.get(k));
          sb.append("\n");
        }
      }
    }
    System.out.println(sb.toString());
  }
}
