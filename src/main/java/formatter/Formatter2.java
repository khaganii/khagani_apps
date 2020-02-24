package formatter;

public class Formatter2 extends Formatter {
  @Override
  public void print(String a){
    a =  a.toUpperCase();
    System.out.println(a);
  }
}
