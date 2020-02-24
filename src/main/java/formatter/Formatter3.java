package formatter;

public class Formatter3 extends Formatter {
  StringBuilder sb = new StringBuilder();
  @Override
  public void print(String a) {
    StringBuilder sb = new StringBuilder();
    sb.append(stars(a.length()+4));
    sb.append("\n");
    sb.append("* ");
    sb.append(a);
    sb.append(" *");
    sb.append("\n");
    sb.append(stars(a.length()+4));
    System.out.println(sb.toString());
  }
  public static String stars(int l)
  {
    StringBuilder ss = new StringBuilder();
    for (int i = 1; i <= l; i++) {
      ss.append("*");
    }
    return ss.toString();
  }
}