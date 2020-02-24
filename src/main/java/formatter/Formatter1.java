package formatter;

public class Formatter1 extends Formatter {
  @Override
  public void print(String a){
    a =  a.toLowerCase();
    System.out.println(a);
  }
}
