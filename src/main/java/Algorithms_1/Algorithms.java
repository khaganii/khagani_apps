package Algorithms_1;

public class Algorithms {
  public static void main(String[] args) {
    System.out.println(invertCase("HeLLo"));
    System.out.println(toLowerCase("HELlo"));
    System.out.println(toUpperCase("helLo"));
  }

  public static String invertCase(String origin){
    String line = "";
    char[] chars = origin.toCharArray();
    for (int i = 0; i < origin.length(); i++) {
      if (chars[i] >= 'a' && chars[i] <= 'z'){
        chars[i] = (char)((int)chars[i]-32);
      }
      if (chars[i] >= 'A' && chars[i] <= 'Z'){
        chars[i] = (char)((int)chars[i]+32);
      }
      line = line + chars[i];
    }
    return line;
  }

  public static String toLowerCase(String origin){
    String line = "";
    char[] chars = origin.toCharArray();
    for (int i = 0; i < origin.length(); i++) {
      if (chars[i] >= 'A' && chars[i] <= 'Z'){
        chars[i] = (char)((int)chars[i]+32);
      }
      line = line + chars[i];
    }
    return line;
  }

  public static String toUpperCase(String origin){
    String line="";
    char[] chars = origin.toCharArray();
    for (int i = 0; i < origin.length(); i++) {
      if (chars[i] >= 'a' && chars[i] <= 'z'){
        chars[i] = (char)((int)chars[i]-32);
      }
      line = line + chars[i];
    }
    return line;
  }
}
